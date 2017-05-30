CFLAGS = -Wall -g

all:
	$(CC) $(CFLAGS) test-example.c -o test-example

clean:
	rm test-example
