objects = Pflanze.java BlauerEisenhut.java Salbei.java Rosengewaechs.java Lorbeerkirsche.java Himbeere.java PflanzenPaar.java Feld.java

abgabe: blatt_und_code.pdf code.zip

code.zip: $(objects)
	zip code.zip $(objects)

blatt_und_code.pdf: blatt_und_code.md
	pandoc -o blatt_und_code.pdf blatt_und_code.md

blatt_und_code.md: blatt.md $(objects)
	cat blatt.md > blatt_und_code.md
	for OBJ in $(objects) ; do \
		echo -e '---\n' >> blatt_und_code.md ; \
		echo '```java' >> blatt_und_code.md ; \
		cat $$OBJ >> blatt_und_code.md ; \
		echo -e '```\n' >> blatt_und_code.md ; done

clean:
	rm blatt_und_code.md
