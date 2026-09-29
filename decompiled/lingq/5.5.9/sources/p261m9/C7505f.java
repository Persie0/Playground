package p261m9;

import android.net.Uri;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.common.collect.ImmutableList;
import ge.C5789m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p275n9.C7733a;
import p293o9.C8020b;
import p319p9.C8209b;
import p335q9.C8505a;
import p360r9.C8748a;
import p384s9.C8982d;
import p396t9.C9229d;
import p402u0.C9362e;
import p411u9.C9482e;
import p411u9.C9484g;
import p433v9.C9680c;
import p453w9.C9845a;
import p453w9.C9849c;
import p453w9.C9850c0;
import p453w9.C9853e;
import p453w9.C9856g;
import p453w9.C9872w;
import p478x9.C10125a;
import p479xa.C10129a;
import p479xa.C10130a0;

/* JADX INFO: renamed from: m9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7505f implements InterfaceC7511l {

    /* JADX INFO: renamed from: d */
    public static final int[] f41481d = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: e */
    public static final a f41482e = new a(new C5789m(14));

    /* JADX INFO: renamed from: f */
    public static final a f41483f = new a(new C9362e(19));

    /* JADX INFO: renamed from: a */
    public boolean f41484a;

    /* JADX INFO: renamed from: b */
    public int f41485b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList<C2416m> f41486c = ImmutableList.m9062Y();

    /* JADX INFO: renamed from: m9.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC10651a f41487a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f41488b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: m9.f$a$a, reason: collision with other inner class name */
        public interface InterfaceC10651a {
            /* JADX INFO: renamed from: b */
            Constructor<? extends InterfaceC7507h> mo12174b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC10651a interfaceC10651a) {
            this.f41487a = interfaceC10651a;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public final InterfaceC7507h m15009a(Object... objArr) {
            Constructor<? extends InterfaceC7507h> constructorMo12174b;
            synchronized (this.f41488b) {
                try {
                    if (!this.f41488b.get()) {
                        try {
                            constructorMo12174b = this.f41487a.mo12174b();
                        } catch (ClassNotFoundException unused) {
                            this.f41488b.set(true);
                            constructorMo12174b = null;
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating extension", e10);
                        }
                    }
                    constructorMo12174b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (constructorMo12174b == null) {
                return null;
            }
            try {
                return constructorMo12174b.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m15007a(int i10, ArrayList arrayList) {
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                arrayList.add(new C9845a());
                return;
            case 1:
                arrayList.add(new C9849c());
                return;
            case 2:
                arrayList.add(new C9853e((this.f41484a ? 1 : 0) | 0 | 0));
                return;
            case 3:
                arrayList.add(new C7733a((this.f41484a ? 1 : 0) | 0 | 0));
                return;
            case 4:
                InterfaceC7507h interfaceC7507hM15009a = f41482e.m15009a(0);
                if (interfaceC7507hM15009a != null) {
                    arrayList.add(interfaceC7507hM15009a);
                    return;
                } else {
                    arrayList.add(new C8209b());
                    return;
                }
            case 5:
                arrayList.add(new C8505a());
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                arrayList.add(new C8982d());
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new C9229d(((this.f41485b | (this.f41484a ? 1 : 0)) == true ? 1 : 0) | 0));
                return;
            case 8:
                arrayList.add(new C9482e());
                arrayList.add(new C9484g(0));
                return;
            case 9:
                arrayList.add(new C9680c());
                return;
            case 10:
                arrayList.add(new C9872w());
                return;
            case 11:
                arrayList.add(new C9850c0(1, new C10130a0(0L), new C9856g(0, this.f41486c)));
                return;
            case 12:
                arrayList.add(new C10125a());
                return;
            case 14:
                arrayList.add(new C8748a());
                return;
            case 15:
                InterfaceC7507h interfaceC7507hM15009a2 = f41483f.m15009a(new Object[0]);
                if (interfaceC7507hM15009a2 != null) {
                    arrayList.add(interfaceC7507hM15009a2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new C8020b());
                return;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: b */
    public final synchronized InterfaceC7507h[] mo34b() {
        return mo15008c(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC7507h[] mo15008c(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f41481d;
        arrayList = new ArrayList(16);
        int iM18997i = C10129a.m18997i(map);
        if (iM18997i != -1) {
            m15007a(iM18997i, arrayList);
        }
        int iM18998j = C10129a.m18998j(uri);
        if (iM18998j != -1 && iM18998j != iM18997i) {
            m15007a(iM18998j, arrayList);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = iArr[i10];
            if (i11 != iM18997i && i11 != iM18998j) {
                m15007a(i11, arrayList);
            }
        }
        return (InterfaceC7507h[]) arrayList.toArray(new InterfaceC7507h[arrayList.size()]);
    }
}
