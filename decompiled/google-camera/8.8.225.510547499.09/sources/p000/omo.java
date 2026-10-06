package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omo {

    /* JADX INFO: renamed from: a */
    public static final omn f46318a;

    static {
        omn omnVar;
        try {
            Object objNewInstance = Class.forName("oms").newInstance();
            objNewInstance.getClass();
            try {
                omnVar = (omn) objNewInstance;
            } catch (ClassCastException e) {
                ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                ClassLoader classLoader2 = omn.class.getClassLoader();
                if (ooc.m18737c(classLoader, classLoader2)) {
                    throw e;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
        } catch (ClassNotFoundException e2) {
            try {
                Object objNewInstance2 = Class.forName(pIeXJQLZLfgIN.nBfoGSOmXPt).newInstance();
                objNewInstance2.getClass();
                try {
                    omnVar = (omn) objNewInstance2;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = omn.class.getClassLoader();
                    if (ooc.m18737c(classLoader3, classLoader4)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                }
            } catch (ClassNotFoundException e4) {
                try {
                    Object objNewInstance3 = Class.forName("omq").newInstance();
                    objNewInstance3.getClass();
                    try {
                        omnVar = (omn) objNewInstance3;
                    } catch (ClassCastException e5) {
                        ClassLoader classLoader5 = objNewInstance3.getClass().getClassLoader();
                        ClassLoader classLoader6 = omn.class.getClassLoader();
                        if (ooc.m18737c(classLoader5, classLoader6)) {
                            throw e5;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e5);
                    }
                } catch (ClassNotFoundException e6) {
                    try {
                        Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        objNewInstance4.getClass();
                        try {
                            omnVar = (omn) objNewInstance4;
                        } catch (ClassCastException e7) {
                            ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = omn.class.getClassLoader();
                            if (ooc.m18737c(classLoader7, classLoader8)) {
                                throw e7;
                            }
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        omnVar = new omn();
                    }
                }
            }
        }
        f46318a = omnVar;
    }
}
