int countLettersAndDigits(std::string input)
{
    char str[100];
    int countDigits = 0,countAlphabet = 0,counter = 0;
    
    for(;input[counter]!=NULL;counter++)
    {
 
        if(input[counter]>='0' && input[counter]<='9')
            countDigits++;
        else if((input[counter]>='A' && input[counter]<='Z')||(input[counter]>='a' && input[counter]<='z'))
            countAlphabet++;
    }
    return (countDigits+countAlphabet);
}
