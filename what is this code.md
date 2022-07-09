So you may be wondering... "what is this massive lump of un-commented Java code that you just dumped onto GitHub?"

Good question.


# The main source directory
In the [main source directory](src/HTMLEngine), there are four subdirectories
- [exceptions](#exceptions)
- [nodes](#nodes)
- [tests](#tests)
- [utils](#tests)


# Exceptions
HTML Engine has a [base exception](src/HTMLEngine/exceptions/BaseException.java), that all custom exceptions derive from.

It also has (at the moment only one) exception that's used throughout HTML Engine, [InvalidCharacterException](src/HTMLEngine/exception/InvalidCharacterException.java) which is thrown when there is an invalid character in something like an attribute or tag name.


# Nodes
There are two nodes:
- [Text](src/HTMLEngine/nodes/Text.java), where all text content is stored.
- [Tag](src/HTMLEngine/nodes/tag/Tag.java), which is the tag with all it's attributes.

For example, in the code ``<p class="get-a-life">Do something real instead of making pointless code on github</p>``, ``<p class="get-a-life">`` and ``</p>`` are from a Tag element (or node), and "Do something real instead of making pointless code on github" is from a Text node.

Tag elements can have children (I know that sounds weird). The children can be other nodes, for example an ``a`` Tag being in a ``p`` Tag, or a Text element being in a ``span`` Tag.
Text elements cannot have children (that also sounds weird).
