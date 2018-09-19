# Event Canceller
Event Canceller is a plugin that gives servers options to cancel certain player events. The current events that can be cancelled are:

* Inventory Open
* Item Craft
* Item Drop
* Item Pickup
* Arrow Pickup
* Consume Potion
* Consume Item
* Item Damage
* Enter Bed

### [Releases](https://github.com/justinhschaaf/EventCanceller/releases)

# Config Guide

### Error Messages

```yaml
errorMessagesEnabled: true
errorMessageGeneric: "You can't do that!"
```

Enable error messages and set the default error message.

### Inventory Open

```yaml
cancelInventoryOpen: true
cancelInventoryOpenMessage:
```

Prevent players from opening their inventory. Set a custom error message using cancelInventoryOpenMessage.

### Item Craft

```yaml
cancelItemCraft: true
cancelItemCraftMessage:
```

Prevent players from crafting items. Set a custom error message using cancelItemCraftMessage.

### Item Drop

```yaml
cancelItemDrop: true
cancelItemDropMessage:
```

Prevent players from dropping items. Set a custom error message using cancelItemDropMessage.

### Item Pickup

```yaml
cancelItemPickup: true
cancelItemPickupMessage: ""
```

Prevent players from picking items up off the ground. By default, the error message is removed through the empty quotation marks.

### Arrow Pickup

```yaml
cancelArrowPickup: false
cancelArrowPickupMessage: ""
```

Prevent players from picking up arrows off the ground. By default, this is disabled and the error message is removed through the empty quotation marks.

### Consume Potion

```yaml
cancelPotionConsume: true
cancelPotionConsumeMessage:
```

Prevent players from consuming potions. Set a custom error message using cancelPotionConsumeMessage.

### Consume Item

```yaml
cancelItemConsume: false
cancelItemConsumeMessage:
```

Prevent players from consuming items, such as food. Set a custom error message using cancelItemConsumeMessage. By default, this is disabled.

### Item Damage

```yaml
cancelItemDamage: true
cancelItemDamageMessage: ""
```

Prevent items from taking damage. By default, the error message is disabled through the use of the quotation marks. **This effectively disallows items from breaking, so you can finally have your dream gold sword not break halfway through the battle.**

### Enter Bed

```yaml
cancelBedEnter: true
cancelBedEnterMessage:
```

Prevent players from entering beds. Set a custom error message using cancelBedEnterMessage.
