package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import com.google.android.gms.internal.measurement.AbstractC2771n6;
import com.google.android.gms.internal.measurement.C2715j6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2771n6<MessageType extends AbstractC2771n6<MessageType, BuilderType>, BuilderType extends C2715j6<MessageType, BuilderType>> extends AbstractC2756m5<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2689h8 zzc = C2689h8.f14234f;

    /* JADX INFO: renamed from: k */
    public static AbstractC2771n6 m8079k(Class cls) {
        Map map = zza;
        AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) map.get(cls);
        if (abstractC2771n6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2771n6 = (AbstractC2771n6) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2771n6 == null) {
            abstractC2771n6 = (AbstractC2771n6) ((AbstractC2771n6) C2812q8.m8221i(cls)).mo7659s(6);
            if (abstractC2771n6 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC2771n6);
        }
        return abstractC2771n6;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static C2590a7 m8080l(InterfaceC2823r6 interfaceC2823r6) {
        C2590a7 c2590a7 = (C2590a7) interfaceC2823r6;
        int i10 = c2590a7.f14053c;
        int i11 = i10 == 0 ? 10 : i10 + i10;
        if (i11 >= i10) {
            return new C2590a7(Arrays.copyOf(c2590a7.f14052b, i11), c2590a7.f14053c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC2836s6 m8081m(InterfaceC2836s6 interfaceC2836s6) {
        int size = interfaceC2836s6.size();
        return interfaceC2836s6.mo7645r(size == 0 ? 10 : size + size);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: n */
    public static Object m8082n(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8083p(Class cls, AbstractC2771n6 abstractC2771n6) {
        abstractC2771n6.m8087o();
        zza.put(cls, abstractC2771n6);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2756m5
    /* JADX INFO: renamed from: a */
    public final int mo8065a(InterfaceC2876v7 interfaceC2876v7) {
        if (m8089r()) {
            int iM8084h = m8084h(interfaceC2876v7);
            if (iM8084h >= 0) {
                return iM8084h;
            }
            throw new IllegalStateException(C0166e.m761g("serialized size must be non-negative, was ", iM8084h));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iM8084h2 = m8084h(interfaceC2876v7);
        if (iM8084h2 < 0) {
            throw new IllegalStateException(C0166e.m761g("serialized size must be non-negative, was ", iM8084h2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iM8084h2;
        return iM8084h2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2730k7
    /* JADX INFO: renamed from: b */
    public final int mo7920b() {
        int iM8084h;
        if (m8089r()) {
            iM8084h = m8084h(null);
            if (iM8084h < 0) {
                throw new IllegalStateException(C0166e.m761g("serialized size must be non-negative, was ", iM8084h));
            }
        } else {
            iM8084h = this.zzd & Integer.MAX_VALUE;
            if (iM8084h == Integer.MAX_VALUE) {
                iM8084h = m8084h(null);
                if (iM8084h < 0) {
                    throw new IllegalStateException(C0166e.m761g("serialized size must be non-negative, was ", iM8084h));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iM8084h;
            }
        }
        return iM8084h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2744l7
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2771n6 mo8049c() {
        return (AbstractC2771n6) mo7659s(6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2730k7
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2715j6 mo7921d() {
        return (C2715j6) mo7659s(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2837s7.f14426c.m8253a(getClass()).mo8113i(this, (AbstractC2771n6) obj);
    }

    /* JADX INFO: renamed from: h */
    public final int m8084h(InterfaceC2876v7 interfaceC2876v7) {
        if (interfaceC2876v7 != null) {
            return interfaceC2876v7.mo8111g(this);
        }
        return C2837s7.f14426c.m8253a(getClass()).mo8111g(this);
    }

    public final int hashCode() {
        if (m8089r()) {
            return C2837s7.f14426c.m8253a(getClass()).mo8109e(this);
        }
        int iMo8109e = this.zzb;
        if (iMo8109e == 0) {
            iMo8109e = C2837s7.f14426c.m8253a(getClass()).mo8109e(this);
            this.zzb = iMo8109e;
        }
        return iMo8109e;
    }

    /* JADX INFO: renamed from: i */
    public final C2715j6 m8085i() {
        return (C2715j6) mo7659s(5);
    }

    /* JADX INFO: renamed from: j */
    public final C2715j6 m8086j() {
        C2715j6 c2715j6 = (C2715j6) mo7659s(5);
        if (!c2715j6.f14270a.equals(this)) {
            if (!c2715j6.f14271b.m8089r()) {
                AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) c2715j6.f14270a.mo7659s(4);
                C2837s7.f14426c.m8253a(abstractC2771n6.getClass()).mo8112h(abstractC2771n6, c2715j6.f14271b);
                c2715j6.f14271b = abstractC2771n6;
            }
            AbstractC2771n6 abstractC2771n7 = c2715j6.f14271b;
            C2837s7.f14426c.m8253a(abstractC2771n7.getClass()).mo8112h(abstractC2771n7, this);
        }
        return c2715j6;
    }

    /* JADX INFO: renamed from: o */
    public final void m8087o() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: q */
    public final void m8088q() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8089r() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo7659s(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = C2758m7.f14313a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        C2758m7.m8069c(this, sb2, 0);
        return sb2.toString();
    }
}
