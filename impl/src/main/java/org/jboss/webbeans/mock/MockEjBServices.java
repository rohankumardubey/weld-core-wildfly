/**
 * 
 */
package org.jboss.webbeans.mock;

import java.lang.annotation.Annotation;
import java.util.Collection;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.inject.manager.InjectionPoint;
import javax.persistence.PersistenceContext;

import org.jboss.webbeans.bootstrap.spi.WebBeanDiscovery;
import org.jboss.webbeans.ejb.api.SessionObjectReference;
import org.jboss.webbeans.ejb.spi.EjbDescriptor;
import org.jboss.webbeans.ejb.spi.EjbServices;
import org.jboss.webbeans.resources.spi.NamingContext;

public class MockEjBServices implements EjbServices
{
   
   private final MockEjbDiscovery ejbDiscovery;
   
   public MockEjBServices(WebBeanDiscovery webBeanDiscovery)
   {
      this.ejbDiscovery = new MockEjbDiscovery(webBeanDiscovery);
   }
   
   public Class<? extends Annotation> getEJBAnnotation()
   {
      return EJB.class;
   }
   
   public Class<? extends Annotation> getPersistenceContextAnnotation()
   {
      return PersistenceContext.class;
   }
   
   public Object resolveEjb(InjectionPoint injectionPoint, NamingContext namingContext)
   {
      return null;
   }
   
   public Object resolvePersistenceContext(InjectionPoint injectionPoint, NamingContext namingContext)
   {
      return null;
   }
   
   public Class<? extends Annotation> getResourceAnnotation()
   {
      return Resource.class;
   }
   
   public Object resolveResource(InjectionPoint injectionPoint, NamingContext namingContext)
   {
      return null;
   }
   
   public void removeEjb(Collection<Object> instance)
   {
      // No-op
   }
   
   public Iterable<EjbDescriptor<?>> discoverEjbs()
   {
      return ejbDiscovery.discoverEjbs();
   }

   public SessionObjectReference resolveEJB(EjbDescriptor<?> ejbDescriptor, NamingContext naming)
   {
      return new SessionObjectReference()
      {

         public <S> S getReference(Class<S> businessInterfaceType)
         {
            // TODO Auto-generated method stub
            return null;
         }

         public void remove()
         {
            // TODO Auto-generated method stub
            
         }
         
      };
   }
}