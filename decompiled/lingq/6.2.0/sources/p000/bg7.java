package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class bg7 implements SerialDescriptor, rl0 {

    /* JADX INFO: renamed from: a */
    public final String f8502a;

    /* JADX INFO: renamed from: b */
    public final zk3 f8503b;

    /* JADX INFO: renamed from: c */
    public final int f8504c;

    /* JADX INFO: renamed from: d */
    public int f8505d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f8506e;

    /* JADX INFO: renamed from: f */
    public final List[] f8507f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f8508g;

    /* JADX INFO: renamed from: h */
    public Map f8509h;

    /* JADX INFO: renamed from: i */
    public final cs4 f8510i;

    /* JADX INFO: renamed from: j */
    public final cs4 f8511j;

    /* JADX INFO: renamed from: k */
    public final cs4 f8512k;

    public bg7(String str, zk3 zk3Var, int i) {
        this.f8502a = str;
        this.f8503b = zk3Var;
        this.f8504c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f8506e = strArr;
        int i4 = this.f8504c;
        this.f8507f = new List[i4];
        this.f8508g = new boolean[i4];
        this.f8509h = AbstractC3194a.m15360M();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f8510i = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: ag7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bg7 f604b;

            {
                this.f604b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i5 = i2;
                bg7 bg7Var = this.f604b;
                switch (i5) {
                    case 0:
                        zk3 zk3Var2 = bg7Var.f8503b;
                        return (zk3Var2 == null || (kSerializerArrChildSerializers = zk3Var2.childSerializers()) == null) ? te1.f62178b : kSerializerArrChildSerializers;
                    case 1:
                        zk3 zk3Var3 = bg7Var.f8503b;
                        if (zk3Var3 == null || (kSerializerArrTypeParametersSerializers = zk3Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return eh0.m11131k(arrayList);
                    default:
                        return Integer.valueOf(r46.m20399z(bg7Var, (SerialDescriptor[]) bg7Var.f8511j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f8511j = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: ag7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bg7 f604b;

            {
                this.f604b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i6 = i5;
                bg7 bg7Var = this.f604b;
                switch (i6) {
                    case 0:
                        zk3 zk3Var2 = bg7Var.f8503b;
                        return (zk3Var2 == null || (kSerializerArrChildSerializers = zk3Var2.childSerializers()) == null) ? te1.f62178b : kSerializerArrChildSerializers;
                    case 1:
                        zk3 zk3Var3 = bg7Var.f8503b;
                        if (zk3Var3 == null || (kSerializerArrTypeParametersSerializers = zk3Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return eh0.m11131k(arrayList);
                    default:
                        return Integer.valueOf(r46.m20399z(bg7Var, (SerialDescriptor[]) bg7Var.f8511j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f8512k = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: ag7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bg7 f604b;

            {
                this.f604b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                int i7 = i6;
                bg7 bg7Var = this.f604b;
                switch (i7) {
                    case 0:
                        zk3 zk3Var2 = bg7Var.f8503b;
                        return (zk3Var2 == null || (kSerializerArrChildSerializers = zk3Var2.childSerializers()) == null) ? te1.f62178b : kSerializerArrChildSerializers;
                    case 1:
                        zk3 zk3Var3 = bg7Var.f8503b;
                        if (zk3Var3 == null || (kSerializerArrTypeParametersSerializers = zk3Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return eh0.m11131k(arrayList);
                    default:
                        return Integer.valueOf(r46.m20399z(bg7Var, (SerialDescriptor[]) bg7Var.f8511j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f8502a;
    }

    @Override // p000.rl0
    /* JADX INFO: renamed from: b */
    public final Set mo3695b() {
        return this.f8509h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        Integer num = (Integer) this.f8509h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return this.f8504c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bg7) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f8502a.equals(serialDescriptor.mo3694a()) && Arrays.equals((SerialDescriptor[]) this.f8511j.getValue(), (SerialDescriptor[]) ((bg7) obj).f8511j.getValue())) {
                int iMo3697e = serialDescriptor.mo3697e();
                int i = this.f8504c;
                if (i == iMo3697e) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (fa4.m11650l(mo3700i(i2).mo3694a(), serialDescriptor.mo3700i(i2).mo3694a()) && fa4.m11650l(mo3700i(i2).getKind(), serialDescriptor.mo3700i(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return this.f8506e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return EmptyList.f47638a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC3184kh getKind() {
        return hl9.f42585y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        List list = this.f8507f[i];
        return list == null ? EmptyList.f47638a : list;
    }

    public int hashCode() {
        return ((Number) this.f8512k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public SerialDescriptor mo3700i(int i) {
        return ((KSerializer[]) this.f8510i.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        return this.f8508g[i];
    }

    /* JADX INFO: renamed from: k */
    public final void m3702k(String str, boolean z) {
        str.getClass();
        int i = this.f8505d + 1;
        this.f8505d = i;
        String[] strArr = this.f8506e;
        strArr[i] = str;
        this.f8508g[i] = z;
        this.f8507f[i] = null;
        if (i == this.f8504c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f8509h = map;
        }
    }

    public String toString() {
        return r46.m20371N(this);
    }
}
