package Classes;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class BemDAO extends ConectaBD {

	private static final long serialVersionUID = 1L;
	
	public void update2(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE bem SET nome_bem = ?, custo = ?, data_aquisicao = ?, uso = ?, tempo_uso = ?, turnos = ?, vida_util = ?, valor_residual = ?, venda = ?" + 
				"WHERE id = ?";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);
			ps.setString(1, bem.getNome_bem());
			ps.setFloat(2, bem.getCusto());
			ps.setString(3, bem.getData_aquisicao());
			ps.setString(4, bem.getUso());
			ps.setInt(5, bem.getTempo_uso());
			ps.setInt(6, bem.getTurnos());
			ps.setInt(7, bem.getVida_util());
			ps.setFloat(8, bem.getValor_residual());
			ps.setString(9, bem.getVenda());
			ps.setLong(10, bem.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no insert do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	public void update1(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE bem SET nome_bem = ?, custo = ?, data_aquisicao = ?, uso = ?, tempo_uso = ?, turnos = ?, vida_util = ?, valor_residual = ?, venda = ?, data_venda = ?, valor_venda = ?" + 
				"WHERE id = ?";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);
			ps.setString(1, bem.getNome_bem());
			ps.setFloat(2, bem.getCusto());
			ps.setString(3, bem.getData_aquisicao());
			ps.setString(4, bem.getUso());
			ps.setInt(5, bem.getTempo_uso());
			ps.setInt(6, bem.getTurnos());
			ps.setInt(7, bem.getVida_util());
			ps.setFloat(8, bem.getValor_residual());
			ps.setString(9, bem.getVenda());
			ps.setString(10, bem.getData_venda());
			ps.setFloat(11, bem.getValor_venda());
			ps.setLong(12, bem.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no insert do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	public void update(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE bem SET venda = ?, data_venda = ?, valor_venda = ?" + 
				"WHERE id = ?";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);			
			ps.setString(1, bem.getVenda());
			ps.setString(2, bem.getData_venda());
			ps.setFloat(3, bem.getValor_venda());
			ps.setLong(4, bem.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no insert do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	
	public void delete(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM bem WHERE id = ?";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);
			ps.setLong(1, bem.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no delete do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	
	public void insert(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO bem(data_venda,valor_venda)" + 
				"VALUES (?, ?)";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);
			ps.setString(1, bem.getData_venda());
			ps.setFloat(2, bem.getValor_venda());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no insert do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	
	public void insert2(Bem bem) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO bem(nome_bem, custo, data_aquisicao, uso, tempo_uso, turnos, vida_util, valor_residual, venda)" + 
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);			
			ps.setString(1, bem.getNome_bem());
			ps.setFloat(2, bem.getCusto());			
			ps.setString(3, bem.getData_aquisicao());
			ps.setString(4, bem.getUso());
			ps.setInt(5, bem.getTempo_uso());
			ps.setInt(6, bem.getTurnos());
			ps.setInt(7, bem.getVida_util());
			ps.setFloat(8, bem.getValor_residual());
			ps.setString(9, bem.getVenda());
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro no insert do DAO: " + e.getMessage());
			e.printStackTrace();
		} finally {
			fecha(con, ps);
		}
	}
	public List<Bem> selectAll(){
		List<Bem> lsBems = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT id, nome_bem, custo, data_aquisicao, uso, tempo_uso, turnos, vida_util, valor_residual, venda, data_venda, valor_venda FROM bem";
		
		try {
			con = abrirConexao();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			lsBems = new ArrayList<Bem>();
			while (rs.next()) {
				Bem e = new Bem();
				e.setId(rs.getLong("id"));
				e.setNome_bem(rs.getString("nome_bem"));
				e.setCusto(rs.getFloat("custo"));
				e.setData_aquisicao(rs.getString("data_aquisicao"));
				e.setUso(rs.getString("uso"));
				e.setTempo_uso(rs.getInt("tempo_uso"));
				e.setTurnos(rs.getInt("turnos"));
				e.setVida_util(rs.getInt("vida_util"));
				e.setValor_residual(rs.getFloat("valor_residual"));
				e.setVenda(rs.getString("venda"));
				e.setData_venda(rs.getString("data_venda"));
				e.setValor_venda(rs.getFloat("valor_venda"));
				lsBems.add(e);
			}
		} catch (Exception e) {
			System.err.println("Erro no selectAll do DAO: " + e.getMessage());
			e.printStackTrace();
		}finally {
			fecha(con, ps, rs);
		}
		
		return lsBems;
	}

}
