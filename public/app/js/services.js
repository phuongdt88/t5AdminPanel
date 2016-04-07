'use strict';

angular.module('xenon.services', []).
	service('$menuItems', function()
	{
		this.menuItems = [];

		var $menuItemsRef = this;

		var menuItemObj = {
			parent: null,

			title: '',
			link: '', // starting with "./" will refer to parent link concatenation
			state: '', // will be generated from link automatically where "/" (forward slashes) are replaced with "."
			icon: '',

			isActive: false,
			label: null,

			menuItems: [],

			setLabel: function(label, color, hideWhenCollapsed)
			{
				if(typeof hideWhenCollapsed == 'undefined')
					hideWhenCollapsed = true;

				this.label = {
					text: label,
					classname: color,
					collapsedHide: hideWhenCollapsed
				};

				return this;
			},

			addItem: function(title, link, icon)
			{
				var parent = this,
					item = angular.extend(angular.copy(menuItemObj), {
						parent: parent,

						title: title,
						link: link,
						icon: icon
					});

				if(item.link)
				{
					if(item.link.match(/^\./))
						item.link = parent.link + item.link.substring(1, link.length);

					if(item.link.match(/^-/))
						item.link = parent.link + '-' + item.link.substring(2, link.length);

					item.state = $menuItemsRef.toStatePath(item.link);
				}

				this.menuItems.push(item);

				return item;
			}
		};

		this.addItem = function(title, link, icon)
		{
			var item = angular.extend(angular.copy(menuItemObj), {
				title: title,
				link: link,
				state: this.toStatePath(link),
				icon: icon
			});

			this.menuItems.push(item);

			return item;
		};

		this.getMenuForAdmin = function()
		{
			var category = this.addItem('All', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			this.menuItems[0].addItem('Dashboard', 		'/app/dashboard', 			'linecons-star');
			this.menuItems[0].addItem('LTV Calculator', 		'/app/ltvcalculator', 			'linecons-star');
			this.menuItems[0].addItem('Pull Activities', 		'/app/pullactivities', 			'linecons-star');
			this.menuItems[0].addItem('Player Game State', 		'/app/gamestate', 			'linecons-database');
			this.menuItems[0].addItem('Tribes', 		'/app/tribes', 			'linecons-shop');
			this.menuItems[0].addItem('Time Zone', 		'/app/timezone', 			'linecons-clock');
			this.menuItems[0].addItem('Text String', 		'/app/textstring', 			'linecons-globe');
			this.menuItems[0].addItem('Profanity (Text)', 		'/app/profanity', 			'linecons-fire');
			this.menuItems[0].addItem('Publish News', 		'/app/news', 			'linecons-note');
			this.menuItems[0].addItem('IAP Data', '/app/analysis-IAP', 'linecons-database');
			this.menuItems[0].addItem('Players Data', '/app/analysis-DAU', 'linecons-database');
			this.menuItems[0].addItem('Adjust Callback Data', 'app/analysis-adjustcallback', 'linecons-database');
			this.menuItems[0].addItem('Game Data (Static)', 		'/agamesettingspp/gamedata', 			'linecons-database');
			this.menuItems[0].addItem('Game Settings', 		'/app/', 			'linecons-cog');
			this.menuItems[0].addItem('Bundle', 		'/app/bundle', 			'linecons-photo');
			return this.menuItems;
			// return this.menuItems[0].menuItems.splice(0,1);
		};

		this.getMenuForProductManager = function() {
			var category = this.addItem('Product Manager', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			this.menuItems[0].addItem('Player Game State', 		'/app/gamestate', 			'linecons-star');
			this.menuItems[0].addItem('Tribes', 		'/app/tribes', 			'linecons-shop');
			this.menuItems[0].addItem('Time Zone', 		'/app/timezone', 			'linecons-clock');
			this.menuItems[0].addItem('Text String', 		'/app/textstring', 			'linecons-globe');
			this.menuItems[0].addItem('Profanity (Text)', 		'/app/profanity', 			'linecons-fire');
			this.menuItems[0].addItem('Publish News', 		'/app/news', 			'linecons-note');
			this.menuItems[0].addItem('IAP Data', '/app/analysis-IAP', 'linecons-database');
			this.menuItems[0].addItem('Players Data', '/app/analysis-DAU', 'linecons-database');
			this.menuItems[0].addItem('Adjust Callback Data', 'app/analysis-adjustcallback', 'linecons-database');
			this.menuItems[0].addItem('Game Data (Static)', 		'/agamesettingspp/gamedata', 			'linecons-database');
			return this.menuItems;
		};
		this.getMenuForComunityManager = function() {
			var category = this.addItem('Comunity Manager', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			this.menuItems[0].addItem('Player Game State', 		'/app/gamestate', 			'linecons-star');
			this.menuItems[0].addItem('Tribes', 		'/app/tribes', 			'linecons-shop');
			this.menuItems[0].addItem('Time Zone', 		'/app/timezone', 			'linecons-clock');
			return this.menuItems;
		};
		this.getMenuForInvestigatingQA = function() {
			var category = this.addItem('Investigating QA', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			this.menuItems[0].addItem('Text String', 		'/app/textstring', 			'linecons-globe');
			this.menuItems[0].addItem('Profanity (Text)', 		'/app/profanity', 			'linecons-fire');
			this.menuItems[0].addItem('Publish News', 		'/app/news', 			'linecons-note');
			this.menuItems[0].addItem('Game Settings', 		'/app/', 			'linecons-cog');
			return this.menuItems;
		};
		this.getMenuForEngineer = function() {
			var category = this.addItem('Engineer', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			this.menuItems[0].addItem('Text String', 		'/app/textstring', 			'linecons-globe');
			this.menuItems[0].addItem('Profanity (Text)', 		'/app/profanity', 			'linecons-fire');
			this.menuItems[0].addItem('Publish News', 		'/app/news', 			'linecons-note');
			this.menuItems[0].addItem('Bundle', 		'/app/bundle', 			'linecons-photo');
			this.menuItems[0].addItem('Game Settings', 		'/app/', 			'linecons-cog');
			return this.menuItems;
		};

		this.prepareSidebarMenu = function()
		{
			//new design
			var category = this.addItem('Category', '/app/cs', 'linecons-star');
			category.isOpen = true;
			category.isActive = true;
			return this;
		};

		this.instantiate = function()
		{
			return angular.copy( this );
		}

		this.toStatePath = function(path)
		{
			return path.replace(/\//g, '.').replace(/^\./, '');
		};

		this.setActive = function(menuItems, path)
		{
			this.iterateCheck(menuItems, this.toStatePath(path));
		};

		this.setActiveParent = function(item)
		{
			item.isActive = true;
			item.isOpen = true;

			if(item.parent)
				this.setActiveParent(item.parent);
		};

		this.iterateCheck = function(menuItems, currentState)
		{
			angular.forEach(menuItems, function(item)
			{
				if(item.state == currentState)
				{
					item.isActive = true;
					if(item.parent != null)
						$menuItemsRef.setActiveParent(item.parent);
				}
				else
				{
					item.isActive = false;
//					item.isOpen = false;

					if(item.menuItems.length)
					{
						$menuItemsRef.iterateCheck(item.menuItems, currentState);
					}
				}
			});
		}
	});