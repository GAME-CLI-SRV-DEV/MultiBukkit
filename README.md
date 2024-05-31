# 멀티넷
Minestom Server Software with NogyangSpigot, Sponge, Rainbow API, ViaVersion, Geyser. (NOTE: Some Sponge Plugins May Not Work. )                                                                                                                                           
 This Bukkit Supports IPv6-IPv4, Geyser Implementation. which means Multiple Players from java and Bedrock.
 This Bukkit Is Also MultiVersion!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
 마인스톰 서버 라이브러리를 기반으로 NogyangSpigot(Bukkit API), Sponge API, Rainbow, ViaVersion, Geyser를 구현하는 서버 버킷                 
 (경고: 일부 스펀지 플러그인, 버킷 플러그인, 레인보우 플러그인이 동작하지 않을 수 있습니다, 동작하지 않는 플러그인의 경우, Minestom 확장 팩을 사용하여 대체할 수 있으니 참고하세요.)                                                                                     
이 버킷은 버킷, 스펀지, 레인보우 API, IPv6-IPv4 듀얼스택을 동시 구현하기 위한 실험적 멀티-쓰레드형 버킷입니다.                               
이 버킷이 나오게 됨으로써 Bukstom을 대체하며 NogyangSpigot팀 최초로 nms에 의존하지 않는 Multi-CraftBukkit, 일명 MultiBukkit입니다.
공식적인 이름은 멀티넷입니다.
## 공지
> [!CAUTION]
> TECHNICAL DIFFICULTIES
> 멀티넷이 GeyserMC 코어 파일을 사용하려고 하지만 Netty 문제로 인하여 GeyserMC를 사용할 수 없습니다.
> 이로 인해 Bedrock Player는 서버에서 IPv6가 구축된 경우 서버에 접속이 불가능한 사태가 벌어질 것으로 예상됩니다.
> 이번 동안만 GeyserMC의 마인크래프트 서버 프록시 버전을 사용하여주십시오.
> 이 저장소는 직접 Commit 방식을 사용하여, 자신이 원하는 경우 문제를 해결할 수 있습니다. 문제를 해결하고 싶은 경우, 언제든 commit을 하실 수 있습니다.
> TECHNICAL DIFFICULTIES
## 주 기능
Geyser 지원 준비 중
IPv6-IPv4 듀얼스택
Bukkit, Sponge, Rainbow 지원(과반수의 Bukkit, Sponge, Rainbow 플러그인이 Minestom을 사용하지 않으며 작동할 확률이 낮음.)
## 서버 작동
서버를 작동시키려면 다음과 같은 커맨드를 입력하세요.
그러면 다음과 같은 문구들이 로그에 출력되게 됩니다.
```
MultiNet을 시작하는 중...
오후 6시 38분: [멀티넷] MultiNet 버전 Alpha 시작
오후 6시 38분: 공유기 사용 중입니다. 서버 포트가 공유기를 통해 전달되어야 합니다.
오후 6시 38분: IPv6를 사용하는 경우 NAT 듀얼스택으로 포트포워딩됩니다.
오후 6시 38분: [멀티넷CMD] [설정] [MultiNet/Server] 설정 로딩 중
오후 6시 38분: [멀티넷CMD] [IP] [MultiNet/IP] 서버가 공유기 IP 기준 IPv4 12.34.56.78:25565/19132, IPv6 [1234:5678:90ab:cdef:1234:5678:90ab:cdef]:25566/19133에서 열립니다.
오후 6시 38분: [멀티넷CMD] [IP] [MultiNet/IP] 서버가 랜선 IP 기준 IPv4 192.168.219.69:25565/19132, IPv6 [2001:db8:5678:534D:5254:534D:53C]:25566/19133에서 열립니다. 
오후 6시 38분: [멀티넷CMD] [정보] [Minestom/INFO] Starting Minestom Server
오후 6시 39분: [멀티넷CMD] [정보] [Minestom/INFO] Extensions Loaded in 18.75ms
오후 6시 39분: [멀티넷CMD] [정보] [Minestom/INFO] Minestom Server Started Successfully.
오후 6시 39분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] Loading Server Plugin ExamplePlugin 1.0.1
오후 6시 39분: [멀티넷CMD] [정보] [Bukkit/INFO] [ExamplePlugin] FARD
오후 6시 39분: [멀티넷CMD] [정보] [Sponge/INFO] [launch]: Loading Sponge, please wait...
오후 6시 39분: [멀티넷CMD] [정보] [Sponge/INFO] [plugin]: Loaded plugin(s): [spongeapi, sponge, multinet]
오후 6시 39분: [멀티넷CMD] [정보] [Sponge/INFO] [sponge]: Registered service [PaginationService] to plugin 'sponge'.
오후 6시 39분: [멀티넷CMD] [정보] [Rainbow/INFO] ----------------------- Loading Plugins -----------------------
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO]
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Loading block connection mappings ...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Using FastUtil Long2ObjectOpenHashMap for block connections
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaBackwards] Loading translations...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [main] [ViaBackwards] Registering protocols...
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [main] [ViaVersion] ViaVersion detected lowest supported version by the proxy: 1.7.2-1.7.5 (4)
오후 6시 39분: [멀티넷CMD] [정보] [ViaVersion/INFO] [ViaVersion] Highest supported version by the proxy: 1.20.5/1.20.6 (766)
오후 6시 40분: [멀티넷CMD] [정보] [Floodgate/INFO] Floodgate를 부팅하는데 987밀리초가 걸렸습니다
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] 확장을 불러오는 중...
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] 확장 0개를 불러옴
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] ******************************************
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO]
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] Geyser 버전 2.3.1-SNAPSHOT (git-master-0fcf0f9)(을)를 불러오는 중...
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] 
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/INFO] ******************************************
오후 6시 40분: [멀티넷CMD] [정보] [Geyser/nioEventLoopGroup-3-1/INFO] Geyser를 0.0.0.0:19132에서 시작합니다
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
