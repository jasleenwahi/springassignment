package com.knoldus;

public class MessagePrinter
{
    // using message service instance.
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    // function will print the message.
    public void printMessage()
    {
        String messageToPrint = messageService.getMessage();
        System.out.println(messageToPrint);
    }
}
