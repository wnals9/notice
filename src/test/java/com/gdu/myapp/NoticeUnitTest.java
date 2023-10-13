package com.gdu.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdu.myapp.dao.NoticeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NoticeUnitTest {
  
  @Autowired
  private NoticeDao noticeDao;
  
  @Test
  public void test_조회테스트() {
    int colCount = noticeDao.selectList().size();
    assertEquals(5, colCount);
  }

  
  
}
