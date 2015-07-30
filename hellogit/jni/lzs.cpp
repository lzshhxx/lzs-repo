#include <string.h>
#include <stdio.h>
char *lzs(const char *str,char *name)
{
	strcpy(name,str);
	strcat(name," \nsupport by lzs");
	return name;
}
