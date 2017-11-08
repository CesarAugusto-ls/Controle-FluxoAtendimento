# Controle-FluxoAtendimento

Pontos de Atenção:
O Software inicializa realizando a leitura de 3 arquivos .TXT
O local destes arquivos esta descrito na classe Main.java, dentro da variável "caminho2". Na configuração atual os arquivos(txt) devem ficar em "C:\\Program Files\\Controle-FluxoAtendimento\\"
Nomes dos arquivos:
Grupo.txt - "Guarda funcionários que precisam trabalhar nesta area"
Externo.txt - "Guarda funcionários que precisam trabalhar nesta area"
Funcionarios.txt - "Guarda todos os funcionários"

Neste projeto o desafio é apresentar isso em uma pagina web, porem as ferramentas estão limitadas e não seria possível inserir um backend embarcado com site. Desta forma o software acessa uma pasta na rede e salva dois arquivos(txt) para que a pagina possa ler esses arquivos.
O local destes arquivos esta descrito na classe Main.java, dentro da variável "caminho". Nestes arquivos somente são salvos os nomes dos funcionários que irão trabalhar na área determinada.
Determine o local dos arquivos, conforme o local da sua pagina web.
Nomes dos arquivos:
AtendimentoExterno.txt
AtendimentoGrupo.txt

O software utiliza a hora do computador para determinar qual área o funcionário irá atuar.
É possível também executar regras de horário manualmente, o selecionar a checkbox do automático para que o programa execute as funções sozinho.


Os nomes dos funcionários são exibidos na pagina web.
Código da pagina web que lê os arquivos .TXT:

<html>
    <head>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>

        <script type="text/javascript">
            var tempo = window.setInterval(carrega, 10 * 1000);
            function carrega()
            {
                $(document).ready(function () {
                    $("#ajax").load("AtendimentoExterno.txt");
                });
                $(document).ready(function () {
                    $("#ajax2").load("AtendimentoGrupo.txt");
                });
            }
        </script>
        <style type="text/css">
            .card {
                overflow: hidden;
                position: relative;
                border: 1px solid #CCC;
                border-radius: 8px;
                text-align: center;
                padding: 0;
                background-color: #7CCD7C;
                color: #000;
                width: 300px;
                margin-top: 15px;
                margin-left: 10px;
                font-family: verdana;
                font-size: 12px;
                font-weight: 100;
                color: #333;
            }
            .card2{
                background-color: #CAE1FF; 
            }
            h2{
                border-bottom: solid 1px #000;
                background-color: #E0EEEE;
                width: 300px;
                padding: 5px;
            }
        </style>

    </head>
    <body>
        <div class="card"><h2>Atendimento Externo</h2>
            <div id ="ajax">
            </div>
        </div>

        <div class="card card2"> <h2>Atendimento Grupo</h2>
            <div id="ajax2">
            </div>
        </div>
    </body>
</html>
