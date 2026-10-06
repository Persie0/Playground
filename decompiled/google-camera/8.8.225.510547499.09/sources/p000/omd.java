package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class omd implements Serializable, ols, omg {

    /* JADX INFO: renamed from: m */
    public final ols f46310m;

    public omd(ols olsVar) {
        this.f46310m = olsVar;
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo561b(Object obj);

    /* JADX INFO: renamed from: c */
    public ols mo562c(Object obj, ols olsVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: cM */
    public StackTraceElement mo18652cM() {
        int iIntValue;
        String strM18656b;
        omh omhVar = (omh) getClass().getAnnotation(omh.class);
        String str = null;
        if (omhVar == null) {
            return null;
        }
        int iM18655a = omhVar.m18655a();
        if (iM18655a > 1) {
            throw new IllegalStateException("Debug metadata version mismatch. Expected: 1, got " + iM18655a + ". Please update the Kotlin standard library.");
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception e) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? omhVar.m18659e()[iIntValue] : -1;
        C1058va c1058va = omi.f46315b;
        if (c1058va == null) {
            try {
                C1058va c1058va2 = new C1058va(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                omi.f46315b = c1058va2;
                c1058va = c1058va2;
            } catch (Exception e2) {
                c1058va = omi.f46314a;
                omi.f46315b = c1058va;
            }
        }
        if (c1058va != omi.f46314a) {
            Object obj2 = c1058va.f47803b;
            Object objInvoke = obj2 != null ? ((Method) obj2).invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Object obj3 = c1058va.f47802a;
                Object objInvoke2 = obj3 != null ? ((Method) obj3).invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Object obj4 = c1058va.f47804c;
                    Object objInvoke3 = obj4 != null ? ((Method) obj4).invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strM18656b = omhVar.m18656b();
        } else {
            strM18656b = str + '/' + omhVar.m18656b();
        }
        return new StackTraceElement(strM18656b, omhVar.m18658d(), omhVar.m18657c(), i);
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: e */
    public final void mo18640e(Object obj) {
        ols olsVar = this;
        while (true) {
            olsVar.getClass();
            omd omdVar = (omd) olsVar;
            ols olsVar2 = omdVar.f46310m;
            olsVar2.getClass();
            try {
                obj = omdVar.mo561b(obj);
                if (obj == oma.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = lkm.m15591r(th);
            }
            omdVar.mo18654h();
            if (!(olsVar2 instanceof omd)) {
                olsVar2.mo18640e(obj);
                return;
            }
            olsVar = olsVar2;
        }
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: g */
    public omg mo18653g() {
        ols olsVar = this.f46310m;
        if (olsVar instanceof omg) {
            return (omg) olsVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    protected void mo18654h() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objMo18652cM = mo18652cM();
        if (objMo18652cM == null) {
            objMo18652cM = getClass().getName();
        }
        sb.append(objMo18652cM);
        return sb.toString();
    }
}
