package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.abt.AbtException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m43 {

    /* JADX INFO: renamed from: a */
    public final uo7 f50563a;

    /* JADX INFO: renamed from: b */
    public Integer f50564b = null;

    public m43(uo7 uo7Var) {
        this.f50563a = uo7Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16618a(ArrayList arrayList, C3023g2 c3023g2) {
        String strM12300c = c3023g2.m12300c();
        String strM12301d = c3023g2.m12301d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3023g2 c3023g3 = (C3023g2) it.next();
            if (c3023g3.m12300c().equals(strM12300c) && c3023g3.m12301d().equals(strM12301d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m16619b() {
        C3182kf c3182kf = (C3182kf) ((InterfaceC3036gf) this.f50563a.get());
        c3182kf.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : c3182kf.f47117a.f12311a.m23089f("frc", "")) {
            ImmutableSet immutableSet = urb.f64252a;
            lda.m16130p(bundle);
            C2999ff c2999ff = new C2999ff();
            String str = (String) hed.m13215c(bundle, "origin", String.class, null);
            lda.m16130p(str);
            c2999ff.f38972a = str;
            String str2 = (String) hed.m13215c(bundle, "name", String.class, null);
            lda.m16130p(str2);
            c2999ff.f38973b = str2;
            c2999ff.f38974c = hed.m13215c(bundle, "value", Object.class, null);
            c2999ff.f38975d = (String) hed.m13215c(bundle, "trigger_event_name", String.class, null);
            c2999ff.f38976e = ((Long) hed.m13215c(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c2999ff.f38977f = (String) hed.m13215c(bundle, "timed_out_event_name", String.class, null);
            c2999ff.f38978g = (Bundle) hed.m13215c(bundle, "timed_out_event_params", Bundle.class, null);
            c2999ff.f38979h = (String) hed.m13215c(bundle, "triggered_event_name", String.class, null);
            c2999ff.f38980i = (Bundle) hed.m13215c(bundle, "triggered_event_params", Bundle.class, null);
            c2999ff.f38981j = ((Long) hed.m13215c(bundle, "time_to_live", Long.class, 0L)).longValue();
            c2999ff.f38982k = (String) hed.m13215c(bundle, "expired_event_name", String.class, null);
            c2999ff.f38983l = (Bundle) hed.m13215c(bundle, "expired_event_params", Bundle.class, null);
            c2999ff.f38985n = ((Boolean) hed.m13215c(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            c2999ff.f38984m = ((Long) hed.m13215c(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c2999ff.f38986o = ((Long) hed.m13215c(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c2999ff);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX INFO: renamed from: c */
    public final void m16620c(ArrayList arrayList) throws AbtException {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        String str;
        String str2;
        String str3;
        uo7 uo7Var = this.f50563a;
        if (uo7Var.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<C3023g2> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C3023g2.m12299b((Map) it.next()));
        }
        if (arrayList2.isEmpty()) {
            if (uo7Var.get() == null) {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            Iterator it2 = m16619b().iterator();
            while (it2.hasNext()) {
                String str4 = ((C2999ff) it2.next()).f38973b;
                v3c v3cVar = ((C3182kf) ((InterfaceC3036gf) uo7Var.get())).f47117a.f12311a;
                v3cVar.m23087c(new qxb(v3cVar, str4, (String) null, (Bundle) null));
            }
            return;
        }
        if (uo7Var.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayListM16619b = m16619b();
        ArrayList<C3023g2> arrayList3 = new ArrayList();
        Iterator it3 = arrayListM16619b.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C3023g2.m12298a((C2999ff) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (C3023g2 c3023g2 : arrayList3) {
            if (!m16618a(arrayList2, c3023g2)) {
                arrayList4.add(c3023g2.m12302e());
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            String str5 = ((C2999ff) it4.next()).f38973b;
            v3c v3cVar2 = ((C3182kf) ((InterfaceC3036gf) uo7Var.get())).f47117a.f12311a;
            v3cVar2.m23087c(new qxb(v3cVar2, str5, (String) null, (Bundle) null));
        }
        ArrayList<C3023g2> arrayList5 = new ArrayList();
        for (C3023g2 c3023g3 : arrayList2) {
            if (!m16618a(arrayList3, c3023g3)) {
                arrayList5.add(c3023g3);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(m16619b());
        if (this.f50564b == null) {
            this.f50564b = Integer.valueOf(((C3182kf) ((InterfaceC3036gf) uo7Var.get())).f47117a.f12311a.m23086b("frc"));
        }
        int iIntValue = this.f50564b.intValue();
        for (C3023g2 c3023g4 : arrayList5) {
            while (arrayDeque.size() >= iIntValue) {
                String str6 = ((C2999ff) arrayDeque.pollFirst()).f38973b;
                v3c v3cVar3 = ((C3182kf) ((InterfaceC3036gf) uo7Var.get())).f47117a.f12311a;
                v3cVar3.m23087c(new qxb(v3cVar3, str6, (String) null, (Bundle) null));
            }
            C2999ff c2999ffM12302e = c3023g4.m12302e();
            C3182kf c3182kf = (C3182kf) ((InterfaceC3036gf) uo7Var.get());
            c3182kf.getClass();
            ImmutableSet immutableSet = urb.f64252a;
            String str7 = c2999ffM12302e.f38972a;
            if (!str7.isEmpty()) {
                Object obj = c2999ffM12302e.f38974c;
                if (obj != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeObject(obj);
                            objectOutputStream.flush();
                            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                            try {
                                Object object = objectInputStream.readObject();
                                try {
                                    objectOutputStream.close();
                                    objectInputStream.close();
                                } catch (IOException | ClassNotFoundException unused) {
                                    object = null;
                                }
                                if (object != null) {
                                    if (!urb.m22874a(str7) && urb.m22876c(str7, c2999ffM12302e.f38973b) && (((str = c2999ffM12302e.f38982k) == null || (urb.m22875b(str, c2999ffM12302e.f38983l) && urb.m22877d(str7, c2999ffM12302e.f38982k, c2999ffM12302e.f38983l))) && (((str2 = c2999ffM12302e.f38979h) == null || (urb.m22875b(str2, c2999ffM12302e.f38980i) && urb.m22877d(str7, c2999ffM12302e.f38979h, c2999ffM12302e.f38980i))) && ((str3 = c2999ffM12302e.f38977f) == null || (urb.m22875b(str3, c2999ffM12302e.f38978g) && urb.m22877d(str7, c2999ffM12302e.f38977f, c2999ffM12302e.f38978g)))))) {
                                        AppMeasurementSdk appMeasurementSdk = c3182kf.f47117a;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("origin", c2999ffM12302e.f38972a);
                                        String str8 = c2999ffM12302e.f38973b;
                                        if (str8 != null) {
                                            bundle.putString("name", str8);
                                        }
                                        Object obj2 = c2999ffM12302e.f38974c;
                                        if (obj2 != null) {
                                            hed.m13214b(bundle, obj2);
                                        }
                                        String str9 = c2999ffM12302e.f38975d;
                                        if (str9 != null) {
                                            bundle.putString("trigger_event_name", str9);
                                        }
                                        bundle.putLong("trigger_timeout", c2999ffM12302e.f38976e);
                                        String str10 = c2999ffM12302e.f38977f;
                                        if (str10 != null) {
                                            bundle.putString("timed_out_event_name", str10);
                                        }
                                        Bundle bundle2 = c2999ffM12302e.f38978g;
                                        if (bundle2 != null) {
                                            bundle.putBundle("timed_out_event_params", bundle2);
                                        }
                                        String str11 = c2999ffM12302e.f38979h;
                                        if (str11 != null) {
                                            bundle.putString("triggered_event_name", str11);
                                        }
                                        Bundle bundle3 = c2999ffM12302e.f38980i;
                                        if (bundle3 != null) {
                                            bundle.putBundle("triggered_event_params", bundle3);
                                        }
                                        bundle.putLong("time_to_live", c2999ffM12302e.f38981j);
                                        String str12 = c2999ffM12302e.f38982k;
                                        if (str12 != null) {
                                            bundle.putString("expired_event_name", str12);
                                        }
                                        Bundle bundle4 = c2999ffM12302e.f38983l;
                                        if (bundle4 != null) {
                                            bundle.putBundle("expired_event_params", bundle4);
                                        }
                                        bundle.putLong("creation_timestamp", c2999ffM12302e.f38984m);
                                        bundle.putBoolean("active", c2999ffM12302e.f38985n);
                                        bundle.putLong("triggered_timestamp", c2999ffM12302e.f38986o);
                                        v3c v3cVar4 = appMeasurementSdk.f12311a;
                                        v3cVar4.m23087c(new lxb(v3cVar4, bundle));
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            objectInputStream = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        objectInputStream = null;
                        objectOutputStream = null;
                    }
                } else if (!urb.m22874a(str7)) {
                }
            }
            arrayDeque.offer(c2999ffM12302e);
        }
    }
}
