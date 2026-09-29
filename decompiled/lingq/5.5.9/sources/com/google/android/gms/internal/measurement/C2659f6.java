package com.google.android.gms.internal.measurement;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2659f6 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f14194c = 0;

    /* JADX INFO: renamed from: a */
    public final C2902x7 f14195a = new C2902x7(16);

    /* JADX INFO: renamed from: b */
    public boolean f14196b;

    static {
        new C2659f6(0);
    }

    public C2659f6() {
    }

    public C2659f6(int i10) {
        m7826a();
        m7826a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX INFO: renamed from: c */
    public static final void m7825c(InterfaceC2645e6 interfaceC2645e6, Object obj) {
        boolean z10;
        zzoa zzoaVarM7771c = interfaceC2645e6.m7771c();
        Charset charset = C2849t6.f14439a;
        obj.getClass();
        zzoa zzoaVar = zzoa.zza;
        zzob zzobVar = zzob.INT;
        switch (zzoaVarM7771c.zza().ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof zzka)) {
                    if (obj instanceof byte[]) {
                        return;
                    }
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
                }
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            case 8:
                if (obj instanceof InterfaceC2730k7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2645e6.zza()), interfaceC2645e6.m7771c().zza(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7826a() {
        C2902x7 c2902x7;
        if (!this.f14196b) {
            int i10 = 0;
            while (true) {
                c2902x7 = this.f14195a;
                if (i10 >= c2902x7.m7774b()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) c2902x7.f14175b.get(i10);
                if (entry.getValue() instanceof AbstractC2771n6) {
                    AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) entry.getValue();
                    abstractC2771n6.getClass();
                    C2837s7.f14426c.m8253a(abstractC2771n6.getClass()).mo8105a(abstractC2771n6);
                    abstractC2771n6.m8087o();
                }
                i10++;
            }
            c2902x7.mo7773a();
            this.f14196b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7827b(InterfaceC2645e6 interfaceC2645e6, Object obj) {
        if (!interfaceC2645e6.m7772d()) {
            m7825c(interfaceC2645e6, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m7825c(interfaceC2645e6, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f14195a.put(interfaceC2645e6, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        C2902x7 c2902x7;
        C2659f6 c2659f6 = new C2659f6();
        int i10 = 0;
        while (true) {
            c2902x7 = this.f14195a;
            if (i10 >= c2902x7.m7774b()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2902x7.f14175b.get(i10);
            c2659f6.m7827b((InterfaceC2645e6) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : c2902x7.f14176c.isEmpty() ? C0062b.f160g : c2902x7.f14176c.entrySet()) {
            c2659f6.m7827b((InterfaceC2645e6) entry2.getKey(), entry2.getValue());
        }
        return c2659f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2659f6) {
            return this.f14195a.equals(((C2659f6) obj).f14195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14195a.hashCode();
    }
}
