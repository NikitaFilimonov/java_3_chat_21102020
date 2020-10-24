package server;

public interface AuthService {
    String getNicknameByLoginAndPassword(String login, String password);
    boolean registration(Integer id, String login, String password, String nickname);

    boolean registration(String login, String password, String nickname);
}
