package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.C3386nv;
import p000.e9c;
import p000.fgc;
import p000.fzb;
import p000.g9a;
import p000.m9c;
import p000.s1c;
import p000.ux5;
import p000.zfc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0995f extends AbstractC0998i {
    private static final C0995f zzb;
    private e9c zzd = zfc.m25596g();

    static {
        C0995f c0995f = new C0995f();
        zzb = c0995f;
        AbstractC0998i.m5533f(C0995f.class, c0995f);
    }

    /* JADX INFO: renamed from: p */
    public static fzb m5527p() {
        return (fzb) zzb.m5540k();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public static void m5528q(C0995f c0995f, ArrayList arrayList) {
        e9c e9cVar = c0995f.zzd;
        if (!((s1c) e9cVar).f60164a) {
            int size = e9cVar.size();
            c0995f.zzd = e9cVar.mo10949p(size + size);
        }
        List list = c0995f.zzd;
        Charset charset = m9c.f50823a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof zfc) {
            zfc zfcVar = (zfc) list;
            int i = zfcVar.f71509c + size2;
            int length = zfcVar.f71508b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = g9a.m12427d(length, 3, 2, 1, 10);
                    }
                    zfcVar.f71508b = Arrays.copyOf(zfcVar.f71508b, length);
                } else {
                    zfcVar.f71508b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strM22989l = ux5.m22989l("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        C3386nv.m17635v(strM22989l);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0993e.class});
        }
        if (i2 == 3) {
            return new C0995f();
        }
        if (i2 == 4) {
            return new fzb(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
