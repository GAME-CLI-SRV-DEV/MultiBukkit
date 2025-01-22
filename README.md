# 누리서버

> Rebasing
> 멀티버킷은 1.21.4 업데이트로 녹양스피곳을 재사용할 예정입니다.

```
NogyangSpigotAPI
BeodeulSpigotAPI
```
Minestom Server Software with Paper, Sponge, Rainbow API, ViaVersion, Floodgate.                                                                                                                              
마인스톰 서버 라이브러리를 기반으로 페이퍼, 스펀지, 레인보우, ViaVersion, Floodgate를 구현하는 서버 버킷                 
(경고: 일부 스펀지 플러그인, 버킷 플러그인, 레인보우 플러그인이 동작하지 않을 수 있습니다, 동작하지 않는 플러그인의 경우, Minestom 확장 팩을 사용하여 대체할 수 있으니 참고하세요.)                                                                                     
이 버킷은 버킷, 스펀지를 동시 구현하기 위한 실험적 멀티-쓰레드형 버킷입니다.                               
이 버킷이 나오게 됨으로써 Bukstom을 대체하며 GAME-CLI-SRV-MINECRAFT팀 최초로 nms에 의존하지 않는 Multi-CraftBukkit, 일명 MultiBukkit입니다.
공식적인 이름은 멀티넷 멀티버킷입니다. 
멀티넷 멀티버킷은 현재 진행 중입니다.


### 장점
마인스톰에 Bukkit API, Sponge API가 얹어져 있음
바닐라 마인크래프트를 주력으로 함

## 빌드 일람
```
MultiNet MultiBukkit
-------------------------------------------------------------------------------
빌드번호 마인스톰 버전 브랜치                 여부
ALPHA-1  1c7fc6c12e  master 6월 1일 주도 개발자에 의해 릴리즈로 유출됨
-------------------------------------------------------------------------------
누리버킷
com.ddnsgeek.approximasterstudios2004.nuribukkit
org.bukkit.craftbukkit
net.minestom.server
```

## 주 기능
IPv6-IPv4 듀얼스택
Bukkit, Sponge, Rainbow 지원(과반수의 Bukkit, Sponge, Rainbow 플러그인이 Minestom을 사용하지 않으며 작동할 확률이 낮음.)
바닐라 마인크래프트 주력
## 서버 작동
서버를 작동시키려면 다음과 같은 커맨드를 입력하세요.
```
java -jar MultiBukkit-1.20.6-R0.1-SNAPSHOT.jar
```
그러면 다음과 같은 문구들이 로그에 출력되게 됩니다.
```
MultiNet을 시작하는 중...
오후 6시 38분: [멀티넷] MultiNet 버전 1.20.6-R0.1-SNAPSHOT 시작
오후 6시 38분: 공유기 사용 중입니다. 서버 포트가 공유기를 통해 전달되어야 합니다.
오후 6시 38분: IPv6를 사용하는 경우 NAT 듀얼스택으로 포트포워딩됩니다.
오후 6시 38분: [멀티넷CMD] [설정] [MultiNet/Server] 설정 로딩 중
오후 6시 38분: [멀티넷CMD] [IP] [MultiNet/IP] 서버가 공유기 IP 기준 IPv4 12.34.56.78:25565/19132, IPv6 [1234:5678:90ab:cdef:1234:5678:90ab:cdef]:25566/19133에서 열립니다.
오후 6시 38분: [멀티넷CMD] [IP] [MultiNet/IP] 서버가 랜선 IP 기준 IPv4 192.168.219.69:25565/19132, IPv6 [1234:5678:90ab:cdef:1234:5678:90ab:cdef]:25566/19133에서 열립니다. 
오후 6시 39분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] Loading Server Plugin ExamplePlugin 1.0.1
오후 6시 39분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] FARD
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO]
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Loading block connection mappings ...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Using FastUtil Long2ObjectOpenHashMap for block connections
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaBackwards] Loading translations...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [main] [ViaBackwards] Registering protocols...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [main] [ViaVersion] ViaVersion detected lowest supported version by the proxy: 1.7.2-1.7.5 (4)
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Highest supported version by the proxy: 1.20.5/1.20.6 (766)
오후 6시 40분: [멀티넷CMD] [정보] [Floodgate/INFO] Floodgate를 부팅하는데 987밀리초가 걸렸습니다
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] 완료! (4.018초) /geyser help로 도움말을 참조하세요.
오후 6시 42분: [멀티넷CMD] [정보] [MultiNet/INFO] 멀티넷CMD Alpha 시작! "도움말" 명령어로 도움말을 참조하세요.
>
```
사용가능한 명령어 목록:
```
도움말 (help)
게임모드 (gamemode)
게임규칙 (gamerule)
플러그인 (pl) <sponge:bukkit:rainbow:minestom:geyser>
킬(kill)
몹킬(mobkill)
재시작(reboot/stop)
끝내기(stop/end/shutdown) <-t> h:m:s
멀티넷버전(version/ver)
```
서버를 종료하려면 끝내기 명령어를 사용합니다.
이때 원하는 시간에 끝내고자 하는 경우: -t h:m:s를 사용합니다.
끝내기 명령어를 실행했을때:
```
오후 6시 42분: [멀티넷CMD] [종료] 멀티넷 종료 중...
오후 6시 42분: [멀티넷CMD] [정보] [main] [ViaVersion] ViaVersion is disabling, if this is a reload and you experience issues consider rebooting.
오후 6시 42분: [멀티넷CMD] [정보] [Geyser/INFO] Geyser를 종료합니다.
오후 6시 42분: [멀티넷CMD] [정보] [Geyser/INFO] Geyser가 성공적으로 종료되었습니다.
오후 6시 42분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] Disabling Server Plugin ExamplePlugin v.1.0.1
오후 6시 42분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] DED
오후 6시 42분: [멀티넷CMD] [종료] 이제 멀티넷CMD 창을 닫으셔도 됩니다.
```
