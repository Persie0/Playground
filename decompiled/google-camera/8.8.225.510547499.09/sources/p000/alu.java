package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class alu implements alt {

    /* JADX INFO: renamed from: c */
    public static alu f667c;

    /* JADX INFO: renamed from: d */
    public static final aly f668d = alk.f642b;

    @Override // p000.alt
    /* JADX INFO: renamed from: a */
    public alr mo916a(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            objNewInstance.getClass();
            return (alr) objNewInstance;
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    @Override // p000.alt
    /* JADX INFO: renamed from: b */
    public /* synthetic */ alr mo917b(Class cls, alz alzVar) {
        return acf.m187b(this, cls);
    }
}
