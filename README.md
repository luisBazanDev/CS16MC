<center><h1>CS16MC</h1></center>
<center>Counter Strike 1.6 in Minecraft</center>

The project is based on a memory of the good times playing counter strike 1.6, and is based on recreating the game mechanics in minecraft in order to be as faithful to the game as possible.

## Development Set-Up

### 1. For the plugin

- need a JDK 19
- Build project with maven `clean install`
- Minecraft 1.20.1+

### 2. Use scripts to upload plugin to server (Optional)

1. Install Python 3
2. Install python libraries `pip install -r assets/scripts/requirements.txt`
3. IntelliJ: `Run > Edit configurations... > + > Shell script`
4. Execute: `Script text`
5. Script text: `python assets/scripts/uploadPlugin.py && python assets/scripts/restartTestServer.py`
6. Before launch: `+ > Run Maven Goal`
7. Command line: `clean install`
8. Copy `example.env` to `.env` file
9. Playe your credentials.
10. Ready!
