package com.google.firebase.heartbeatinfo;

import af.C0072e;
import af.InterfaceC0070c;
import af.InterfaceC0071d;
import android.content.Context;
import android.util.Base64OutputStream;
import cf.InterfaceC2005b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.C3218a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p118fe.C5516h;
import p136gc.C5761q;
import p200jf.InterfaceC6475g;
import p291o7.CallableC8003m;
import p389t2.C9192k;

/* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3218a implements InterfaceC0071d, HeartBeatInfo {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2005b<C0072e> f16247a;

    /* JADX INFO: renamed from: b */
    public final Context f16248b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2005b<InterfaceC6475g> f16249c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC0070c> f16250d;

    /* JADX INFO: renamed from: e */
    public final Executor f16251e;

    public C3218a() {
        throw null;
    }

    public C3218a(Context context, String str, Set<InterfaceC0070c> set, InterfaceC2005b<InterfaceC6475g> interfaceC2005b, Executor executor) {
        this.f16247a = new C5516h(context, 1, str);
        this.f16250d = set;
        this.f16251e = executor;
        this.f16249c = interfaceC2005b;
        this.f16248b = context;
    }

    @Override // af.InterfaceC0071d
    /* JADX INFO: renamed from: a */
    public final C5761q mo445a() {
        if (!C9192k.m17533a(this.f16248b)) {
            return Tasks.m8539c("");
        }
        return Tasks.m8538b(this.f16251e, new Callable() { // from class: af.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                C3218a c3218a = this.f192a;
                synchronized (c3218a) {
                    C0072e c0072e = c3218a.f16247a.get();
                    ArrayList arrayListM448c = c0072e.m448c();
                    c0072e.m447b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < arrayListM448c.size(); i10++) {
                        AbstractC0073f abstractC0073f = (AbstractC0073f) arrayListM448c.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", abstractC0073f.mo444b());
                        jSONObject.put("dates", new JSONArray((Collection) abstractC0073f.mo443a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                return string;
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    /* JADX INFO: renamed from: b */
    public final synchronized HeartBeatInfo.HeartBeat mo9185b() {
        boolean zM452g;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0072e c0072e = this.f16247a.get();
            synchronized (c0072e) {
                try {
                    zM452g = c0072e.m452g(jCurrentTimeMillis);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!zM452g) {
                return HeartBeatInfo.HeartBeat.NONE;
            }
            synchronized (c0072e) {
                try {
                    String strM449d = c0072e.m449d(System.currentTimeMillis());
                    c0072e.f193a.edit().putString("last-used-date", strM449d).commit();
                    c0072e.m451f(strM449d);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return HeartBeatInfo.HeartBeat.GLOBAL;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9186c() {
        if (this.f16250d.size() <= 0) {
            Tasks.m8539c(null);
            return;
        }
        int i10 = 1;
        if (!C9192k.m17533a(this.f16248b)) {
            Tasks.m8539c(null);
        } else {
            Tasks.m8538b(this.f16251e, new CallableC8003m(i10, this));
        }
    }
}
