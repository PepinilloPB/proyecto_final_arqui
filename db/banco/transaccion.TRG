TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER act_origen\nAFTER INSERT ON transaccion FOR EACH ROW\nUPDATE cuenta\nSET amount = (amount - new.amount)\nWHERE id = new.coid' 'CREATE DEFINER=`root`@`localhost` TRIGGER act_destino\nAFTER INSERT ON transaccion FOR EACH ROW\nUPDATE cuenta\nSET amount = (amount + new.amount)\nWHERE id = new.cdid'
sql_modes=1436549152 1436549152
definers='root@localhost' 'root@localhost'
client_cs_names='latin1' 'latin1'
connection_cl_names='latin1_swedish_ci' 'latin1_swedish_ci'
db_cl_names='latin1_swedish_ci' 'latin1_swedish_ci'
created=165395728572 165395733627
