package p081e0;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.compose.p017ui.node.C0543b;
import androidx.room.RoomDatabase;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.internal.measurement.AbstractC2881w;
import com.google.android.gms.internal.measurement.C2601b4;
import com.google.android.gms.internal.measurement.C2611c0;
import com.google.android.gms.internal.measurement.C2684h3;
import com.google.android.gms.internal.measurement.C2803q;
import com.google.android.gms.internal.measurement.C2868v;
import com.google.android.gms.internal.measurement.C2894x;
import com.google.android.gms.internal.measurement.C2907y;
import com.google.android.gms.internal.measurement.InterfaceC2597b0;
import com.google.android.gms.internal.measurement.InterfaceC2790p;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.play.core.assetpacks.C3118i;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p007a6.C0028g;
import p023b2.C1293b;
import p060d1.C5019f;
import p060d1.C5022i;
import p060d1.C5023j;
import p060d1.C5027n;
import p060d1.C5028o;
import p105f0.C5458f;
import p127g1.InterfaceC5647k;
import p166i1.C6151j;
import p166i1.InterfaceC6146g0;
import p176ib.C6272i;
import p230l0.C7205b;
import p230l0.C7206c;
import p289o5.C7941u;
import p289o5.InterfaceC7927g;
import p326q.C8446b;
import p338qd.C8523a1;
import p338qd.C8570q0;
import p338qd.C8576s0;
import p338qd.C8579t0;
import p338qd.C8582u0;
import p338qd.InterfaceC8585v0;
import p338qd.InterfaceC8589w1;
import p356r5.C8735e;
import p356r5.InterfaceC8737g;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;
import sl.C9072e;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: e0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5298b1 implements InterfaceC8737g, InterfaceC2597b0, InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public final Object f33572a;

    /* JADX INFO: renamed from: b */
    public final Object f33573b;

    public C5298b1(int i10) {
        if (i10 == 5) {
            this.f33572a = new AtomicReference();
            this.f33573b = new C8446b();
            return;
        }
        if (i10 != 8) {
            this.f33572a = new AtomicReference(C7206c.f40547a);
            this.f33573b = new Object();
            return;
        }
        this.f33572a = new HashMap();
        this.f33573b = new C2611c0();
        m11441j(new C2868v(0));
        m11441j(new C2894x(0));
        m11441j(new C2907y(0));
        m11441j(new C2907y(1));
        m11441j(new C2907y(2));
        m11441j(new C2868v(1));
        m11441j(new C2894x(1));
    }

    public C5298b1(Fragment fragment) {
        C5207g.m11111f(fragment, "fragment");
        this.f33573b = fragment;
    }

    public C5298b1(Context context) {
        C6272i.m12915i(context);
        Resources resources = context.getResources();
        this.f33572a = resources;
        this.f33573b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public C5298b1(Context context, InterfaceC7927g interfaceC7927g) {
        this.f33572a = context;
        this.f33573b = new C7941u(this, interfaceC7927g);
    }

    public C5298b1(C0543b c0543b) {
        C5207g.m11111f(c0543b, "rootCoordinates");
        this.f33572a = c0543b;
        this.f33573b = new C5023j();
    }

    public C5298b1(androidx.fragment.app.Fragment fragment) {
        C5207g.m11111f(fragment, "fragment");
        this.f33572a = fragment;
    }

    public C5298b1(RoomDatabase roomDatabase) {
        C5207g.m11111f(roomDatabase, "database");
        this.f33572a = roomDatabase;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C5207g.m11110e(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f33573b = setNewSetFromMap;
    }

    public /* synthetic */ C5298b1(Object obj, Object obj2) {
        this.f33572a = obj;
        this.f33573b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11435a(C6151j c6151j, long j10) {
        C5022i c5022i;
        C5207g.m11111f(c6151j, "pointerInputNodes");
        C5023j c5023j = (C5023j) this.f33573b;
        int i10 = c6151j.f35969d;
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            InterfaceC6146g0 interfaceC6146g0 = (InterfaceC6146g0) c6151j.f35966a[i11];
            if (z10) {
                C5458f<C5022i> c5458f = c5023j.f32831a;
                int i12 = c5458f.f34019c;
                if (i12 <= 0) {
                    c5022i = null;
                    break;
                }
                C5022i[] c5022iArr = c5458f.f34017a;
                int i13 = 0;
                while (true) {
                    c5022i = c5022iArr[i13];
                    if (C5207g.m11106a(c5022i.f32823b, interfaceC6146g0)) {
                        break;
                    }
                    i13++;
                    if (i13 >= i12) {
                        c5022i = null;
                        break;
                    }
                }
                C5022i c5022i2 = c5022i;
                if (c5022i2 != null) {
                    c5022i2.f32829h = true;
                    C5027n c5027n = new C5027n(j10);
                    C5458f<C5027n> c5458f2 = c5022i2.f32824c;
                    if (!c5458f2.m11692i(c5027n)) {
                        c5458f2.m11687b(new C5027n(j10));
                    }
                    c5023j = c5022i2;
                } else {
                    z10 = false;
                    C5022i c5022i3 = new C5022i(interfaceC6146g0);
                    c5022i3.f32824c.m11687b(new C5027n(j10));
                    c5023j.f32831a.m11687b(c5022i3);
                    c5023j = c5022i3;
                }
            } else {
                C5022i c5022i4 = new C5022i(interfaceC6146g0);
                c5022i4.f32824c.m11687b(new C5027n(j10));
                c5023j.f32831a.m11687b(c5022i4);
                c5023j = c5022i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2597b0
    /* JADX INFO: renamed from: b */
    public final C2684h3 mo1214b(InterfaceC2790p interfaceC2790p) {
        C2684h3 c2684h3M7862a = ((C2684h3) this.f33572a).m7862a();
        c2684h3M7862a.m7866e((String) this.f33573b, interfaceC2790p);
        return c2684h3M7862a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11436c(C5019f c5019f, boolean z10) {
        C5023j c5023j = (C5023j) this.f33573b;
        Map<C5027n, C5028o> map = (Map) c5019f.f32814c;
        InterfaceC5647k interfaceC5647k = (InterfaceC5647k) this.f33572a;
        boolean z11 = false;
        if (!c5023j.mo10705a(map, interfaceC5647k, c5019f, z10)) {
            return false;
        }
        boolean zMo10709e = c5023j.mo10709e(map, interfaceC5647k, c5019f, z10);
        if (c5023j.mo10708d(c5019f) || zMo10709e) {
            z11 = true;
        }
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public final Object m11437d() {
        C7205b c7205b = (C7205b) ((AtomicReference) this.f33572a).get();
        int iM14525a = c7205b.m14525a(Thread.currentThread().getId());
        if (iM14525a >= 0) {
            return c7205b.f40546c[iM14525a];
        }
        return null;
    }

    @Override // p356r5.InterfaceC8731a
    /* JADX INFO: renamed from: e */
    public final boolean mo70e(Object obj, File file, C8735e c8735e) {
        return ((InterfaceC8737g) this.f33573b).mo70e(new C0028g(((BitmapDrawable) ((InterfaceC9207m) obj).get()).getBitmap(), (InterfaceC9452c) this.f33572a), file, c8735e);
    }

    /* JADX INFO: renamed from: f */
    public final String m11438f(String str) {
        Resources resources = (Resources) this.f33572a;
        int identifier = resources.getIdentifier(str, "string", (String) this.f33573b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p356r5.InterfaceC8737g
    /* JADX INFO: renamed from: g */
    public final EncodeStrategy mo71g(C8735e c8735e) {
        return ((InterfaceC8737g) this.f33573b).mo71g(c8735e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m11439h(Object obj) {
        boolean z10;
        long id2 = Thread.currentThread().getId();
        synchronized (this.f33573b) {
            try {
                C7205b c7205b = (C7205b) ((AtomicReference) this.f33572a).get();
                int iM14525a = c7205b.m14525a(id2);
                if (iM14525a < 0) {
                    z10 = false;
                } else {
                    c7205b.f40546c[iM14525a] = obj;
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                ((AtomicReference) this.f33572a).set(c7205b.m14526b(id2, obj));
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC2790p m11440i(C2684h3 c2684h3, InterfaceC2790p interfaceC2790p) {
        C2601b4.m7687c(c2684h3);
        if (!(interfaceC2790p instanceof C2803q)) {
            return interfaceC2790p;
        }
        C2803q c2803q = (C2803q) interfaceC2790p;
        ArrayList arrayList = c2803q.f14396b;
        Map map = (Map) this.f33572a;
        String str = c2803q.f14395a;
        return (map.containsKey(str) ? (AbstractC2881w) map.get(str) : (C2611c0) this.f33573b).mo7739a(str, c2684h3, arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final void m11441j(AbstractC2881w abstractC2881w) {
        Iterator it = abstractC2881w.f14483a.iterator();
        while (it.hasNext()) {
            ((Map) this.f33572a).put(((zzbl) it.next()).zzb().toString(), abstractC2881w);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11442k() {
        C7941u c7941u = (C7941u) this.f33573b;
        Context context = (Context) this.f33572a;
        if (!c7941u.f43260b) {
            C2933a.m8515g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver((C7941u) c7941u.f43261c.f33573b);
            c7941u.f43260b = false;
        }
    }

    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        C3118i c3118i = (C3118i) this.f33572a;
        Bundle bundle = (Bundle) this.f33573b;
        c3118i.getClass();
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        HashMap map = c3118i.f15938e;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            C8576s0 c8576s0 = c3118i.m8990c(i10).f46010c;
            int i11 = bundle.getInt(C5212l.m11179t0("status", c8576s0.f45992a));
            int i12 = c8576s0.f45995d;
            boolean zM16633c = C8523a1.m16633c(i12, i11);
            String str = c8576s0.f45992a;
            if (zM16633c) {
                C3118i.f15933g.m15811l("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i12));
                int i13 = c8576s0.f45995d;
                InterfaceC9268p interfaceC9268p = c3118i.f15935b;
                if (i13 == 4) {
                    ((InterfaceC8589w1) interfaceC9268p.zza()).mo8956b(str, i10);
                } else if (i13 == 5) {
                    ((InterfaceC8589w1) interfaceC9268p.zza()).mo8958d(i10);
                } else if (i13 == 6) {
                    ((InterfaceC8589w1) interfaceC9268p.zza()).mo8960f(Arrays.asList(str));
                }
            } else {
                c8576s0.f45995d = i11;
                if (i11 == 5 || i11 == 6 || i11 == 4) {
                    c3118i.m8991d(new C1293b(c3118i, i10));
                    c3118i.f15936c.m16658a(str);
                } else {
                    for (C8582u0 c8582u0 : c8576s0.f45997f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5212l.m11181u0("chunk_intents", str, c8582u0.f46012a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    ((C8570q0) c8582u0.f46015d.get(i14)).f45947a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strM8987e = C3118i.m8987e(bundle);
            long j10 = bundle.getLong(C5212l.m11179t0("pack_version", strM8987e));
            String string = bundle.getString(C5212l.m11179t0("pack_version_tag", strM8987e), "");
            int i15 = bundle.getInt(C5212l.m11179t0("status", strM8987e));
            long j11 = bundle.getLong(C5212l.m11179t0("total_bytes_to_download", strM8987e));
            List<String> stringArrayList = bundle.getStringArrayList(C5212l.m11179t0("slice_ids", strM8987e));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List parcelableArrayList2 = bundle.getParcelableArrayList(C5212l.m11181u0("chunk_intents", strM8987e, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C8570q0(((Intent) it.next()) != null));
                }
                String string2 = bundle.getString(C5212l.m11181u0("uncompressed_hash_sha256", strM8987e, str2));
                long j12 = bundle.getLong(C5212l.m11181u0("uncompressed_size", strM8987e, str2));
                int i16 = bundle.getInt(C5212l.m11181u0("patch_format", strM8987e, str2), 0);
                arrayList.add(i16 != 0 ? new C8582u0(str2, string2, j12, arrayList2, 0, i16) : new C8582u0(str2, string2, j12, arrayList2, bundle.getInt(C5212l.m11181u0("compression_format", strM8987e, str2), 0), 0));
            }
            map.put(Integer.valueOf(i10), new C8579t0(i10, bundle.getInt("app_version_code"), new C8576s0(strM8987e, j10, i15, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }
}
