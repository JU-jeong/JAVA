package socketChat;

import java.io.IOException;
import java.net.Socket;

public class SocketClient {

  public static void main(String[] args) throws IOException {
    Socket sock = new Socket("localhost", 8888);
    System.out.println("������ ���ӵǾ����ϴ�.");
    ReceiveThread receiveThread = new ReceiveThread(sock);
    receiveThread.start();
    SendThread sendThead = new SendThread(sock);
    sendThead.start();
  }
}