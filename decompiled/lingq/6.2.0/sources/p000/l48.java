package p000;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class l48 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f49043a;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f49044b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f49045c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f49046d;

    static {
        Logger.getLogger(l48.class.getName());
        f49043a = new AtomicReference(new ji4());
        f49044b = new ConcurrentHashMap();
        f49045c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f49046d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m15789a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = f49045c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (((ji4) f49043a.get()).f45578a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f49046d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f49046d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m15790b(lda ldaVar, Class cls) {
        fk7 fk7Var = (fk7) l66.f49184b.f49185a.get();
        fk7Var.getClass();
        ek7 ek7Var = new ek7(ldaVar.getClass(), cls);
        HashMap map = fk7Var.f39225a;
        if (map.containsKey(ek7Var)) {
            return ((xj7) map.get(ek7Var)).f68293b.mo12754c(ldaVar);
        }
        ij6.m13954l("No PrimitiveConstructor for ", ek7Var, " available");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Object m15791c(String str, ByteString byteString, Class cls) {
        ji4 ji4Var = (ji4) f49043a.get();
        ji4Var.getClass();
        ii4 ii4VarM14488a = ji4Var.m14488a(str);
        Set setKeySet = ((Map) ii4VarM14488a.f44144a.f58433b).keySet();
        AbstractC3517r abstractC3517r = ii4VarM14488a.f44144a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(abstractC3517r.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) abstractC3517r.f58433b).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) abstractC3517r.f58433b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC3517r.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC1126a abstractC1126aMo228q = abstractC3517r.mo228q(byteString);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                abstractC3517r.mo229r(abstractC1126aMo228q);
                zj7 zj7Var = (zj7) ((Map) abstractC3517r.f58433b).get(cls);
                if (zj7Var != null) {
                    return zj7Var.mo196a(abstractC1126aMo228q);
                }
                v63.m23144v("Requested primitive class ", cls.getCanonicalName(), " not supported.");
                return null;
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC3517r.f58432a).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m15792d(String str, byte[] bArr) {
        ByteString byteString = ByteString.f13555b;
        return m15791c(str, ByteString.m6408g(bArr, 0, bArr.length), InterfaceC3364n9.class);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized ai4 m15793e(wi4 wi4Var) {
        or3 or3Var;
        AbstractC3517r abstractC3517r = ((ji4) f49043a.get()).m14488a(wi4Var.m23983A()).f44144a;
        or3Var = new or3(abstractC3517r, (Class) abstractC3517r.f58434c);
        if (!((Boolean) f49045c.get(wi4Var.m23983A())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + wi4Var.m23983A());
        }
        return or3Var.m18297I(wi4Var.m23984B());
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m15794f(AbstractC3517r abstractC3517r, boolean z) {
        try {
            AtomicReference atomicReference = f49043a;
            ji4 ji4Var = new ji4((ji4) atomicReference.get());
            ji4Var.m14489b(abstractC3517r);
            String strMo225i = abstractC3517r.mo225i();
            m15789a(strMo225i, z ? abstractC3517r.mo226j().mo3498t() : Collections.EMPTY_MAP, z);
            if (!((ji4) atomicReference.get()).f45578a.containsKey(strMo225i)) {
                f49044b.put(strMo225i, new gz8(15));
                if (z) {
                    m15795g(strMo225i, abstractC3517r.mo226j().mo3498t());
                }
            }
            f49045c.put(strMo225i, Boolean.valueOf(z));
            atomicReference.set(ji4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15795g(String str, Map map) {
        OutputPrefixType outputPrefixType;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrM6432d = ((AbstractC1126a) ((ej4) entry.getValue()).f37325a).m6432d();
            KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType = ((ej4) entry.getValue()).f37326b;
            vi4 vi4VarM23978C = wi4.m23978C();
            vi4VarM23978C.m22174d();
            wi4.m23979v((wi4) vi4VarM23978C.f62440b, str);
            ByteString byteStringM6408g = ByteString.m6408g(bArrM6432d, 0, bArrM6432d.length);
            vi4VarM23978C.m22174d();
            wi4.m23980w((wi4) vi4VarM23978C.f62440b, byteStringM6408g);
            int i = ui4.f63959b[keyTemplate$OutputPrefixType.ordinal()];
            if (i == 1) {
                outputPrefixType = OutputPrefixType.TINK;
            } else if (i == 2) {
                outputPrefixType = OutputPrefixType.LEGACY;
            } else if (i == 3) {
                outputPrefixType = OutputPrefixType.RAW;
            } else {
                if (i != 4) {
                    C3386nv.m17626m("Unknown output prefix type");
                    return;
                }
                outputPrefixType = OutputPrefixType.CRUNCHY;
            }
            vi4VarM23978C.m22174d();
            wi4.m23981x((wi4) vi4VarM23978C.f62440b, outputPrefixType);
            f49046d.put(str2, new xi4((wi4) vi4VarM23978C.m22171a()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m15796h(jk7 jk7Var) {
        l66 l66Var = l66.f49184b;
        synchronized (l66Var) {
            fs6 fs6Var = new fs6((fk7) l66Var.f49185a.get());
            HashMap map = (HashMap) fs6Var.f39591c;
            if (jk7Var != null) {
                Class clsMo3179c = jk7Var.mo3179c();
                if (map.containsKey(clsMo3179c)) {
                    jk7 jk7Var2 = (jk7) map.get(clsMo3179c);
                    if (!jk7Var2.equals(jk7Var) || !jk7Var.equals(jk7Var2)) {
                        v63.m23146x(clsMo3179c, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                    }
                } else {
                    map.put(clsMo3179c, jk7Var);
                }
            } else {
                C3386nv.m17635v("wrapper must be non-null");
            }
            l66Var.f49185a.set(new fk7(fs6Var));
        }
    }
}
