# 6440transcripts
Hosts the simple code used to parse transcripts from .srt files in CS6440

How to use:

1. Download the .java file.  There is only 1.
2. Run DecodeSRT in your IDE.  It will prompt you for the path of the folder where your transcripts are.
3. Enter the path into the console and hit enter.
4. The text will print out in the console.  

Notes:

The program will place "Video # - " (where # increases with each new section) above each new block of text, delineating the different .srt file inputs.  This is meant to help you map which short video from Udacity each section is from.  Therefore, it's recommended to parse your transcripts one lesson at a time, rather than all at once, otherwise these title numbers will be incorrect and confusing.  You will also want to ensure that your videos are in the correct order (so, title them alphabetically) in your folder.  After copying the printed transcript into a document, I manually entered each video title after the dash as there was no automatic way to do it.   

You will need to use your discretion to better format the transcripts after they have been created.  Some of the text blocks will be quite long and for readability you may want to break them up into paragraphs.  This must be done manually as there is no easy way to tell where a new paragraph should go.  
