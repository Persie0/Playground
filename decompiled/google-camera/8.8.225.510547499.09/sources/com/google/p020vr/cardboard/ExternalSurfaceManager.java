package com.google.p020vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.mbb;
import p000.ofa;
import p000.ofb;
import p000.ofc;
import p000.ofe;
import p000.off;
import p000.ofg;
import p000.ofi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ExternalSurfaceManager {

    /* JADX INFO: renamed from: b */
    private static final String f8442b = ExternalSurfaceManager.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public final ofb f8443a;

    /* JADX INFO: renamed from: c */
    private final Object f8444c;

    /* JADX INFO: renamed from: d */
    private int f8445d;

    /* JADX INFO: renamed from: e */
    private boolean f8446e;

    /* JADX INFO: renamed from: f */
    private volatile mbb f8447f;

    public ExternalSurfaceManager(long j) {
        ofb ofbVar = new ofb(j);
        this.f8444c = new Object();
        this.f8447f = new mbb((char[]) null);
        this.f8445d = 1;
        this.f8443a = ofbVar;
    }

    /* JADX INFO: renamed from: a */
    private final int m5184a(int i, int i2, off offVar, boolean z) {
        int i3;
        synchronized (this.f8444c) {
            mbb mbbVar = new mbb(this.f8447f, (byte[]) null, (byte[]) null);
            i3 = this.f8445d;
            this.f8445d = i3 + 1;
            ((HashMap) mbbVar.f39760a).put(Integer.valueOf(i3), new ofe(i3, i, i2, offVar, z));
            this.f8447f = mbbVar;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    private final void m5185b(ofg ofgVar) {
        mbb mbbVar = this.f8447f;
        if (this.f8446e && !((HashMap) mbbVar.f39760a).isEmpty()) {
            for (ofe ofeVar : ((HashMap) mbbVar.f39760a).values()) {
                ofeVar.m18461a();
                ofgVar.mo18456a(ofeVar);
            }
        }
        if (((HashMap) mbbVar.f39761b).isEmpty()) {
            return;
        }
        Iterator it = ((HashMap) mbbVar.f39761b).values().iterator();
        while (it.hasNext()) {
            ((ofe) it.next()).m18463c(this.f8443a);
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext() {
        this.f8446e = true;
        mbb mbbVar = this.f8447f;
        if (((HashMap) mbbVar.f39760a).isEmpty()) {
            return;
        }
        Iterator it = ((HashMap) mbbVar.f39760a).values().iterator();
        while (it.hasNext()) {
            ((ofe) it.next()).m18461a();
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.f8446e = false;
        mbb mbbVar = this.f8447f;
        if (((HashMap) mbbVar.f39760a).isEmpty()) {
            return;
        }
        for (ofe ofeVar : ((HashMap) mbbVar.f39760a).values()) {
            if (ofeVar.f45841i) {
                off offVar = ofeVar.f45834b;
                if (offVar != null) {
                    offVar.mo18458a();
                }
                ofeVar.f45839g.detachFromGLContext();
                ofeVar.f45841i = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        m5185b(new ofa(this, 1));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        m5185b(new ofa(this, 0));
    }

    public int createExternalSurface() {
        return m5184a(-1, -1, null, false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return m5184a(i, i2, new ofi(j, j2), z);
    }

    public Surface getSurface(int i) {
        mbb mbbVar = this.f8447f;
        Object obj = mbbVar.f39760a;
        Integer numValueOf = Integer.valueOf(i);
        if (((HashMap) obj).containsKey(numValueOf)) {
            ofe ofeVar = (ofe) ((HashMap) mbbVar.f39760a).get(numValueOf);
            if (ofeVar.f45841i) {
                return ofeVar.f45840h;
            }
            return null;
        }
        Log.e(f8442b, "Surface with ID " + i + " does not exist, returning null");
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.f8444c) {
            mbb mbbVar = new mbb(this.f8447f, (byte[]) null, (byte[]) null);
            Object obj = mbbVar.f39760a;
            Integer numValueOf = Integer.valueOf(i);
            ofe ofeVar = (ofe) ((HashMap) obj).remove(numValueOf);
            if (ofeVar != null) {
                ((HashMap) mbbVar.f39761b).put(numValueOf, ofeVar);
                this.f8447f = mbbVar;
            } else {
                Log.e(f8442b, gBCSQzBeB.udqaIQPenae + i);
            }
        }
    }

    public void shutdown() {
        synchronized (this.f8444c) {
            mbb mbbVar = this.f8447f;
            this.f8447f = new mbb((char[]) null);
            if (!((HashMap) mbbVar.f39760a).isEmpty()) {
                Iterator it = ((HashMap) mbbVar.f39760a).entrySet().iterator();
                while (it.hasNext()) {
                    ((ofe) ((Map.Entry) it.next()).getValue()).m18463c(this.f8443a);
                }
            }
            if (!((HashMap) mbbVar.f39761b).isEmpty()) {
                Iterator it2 = ((HashMap) mbbVar.f39761b).entrySet().iterator();
                while (it2.hasNext()) {
                    ((ofe) ((Map.Entry) it2.next()).getValue()).m18463c(this.f8443a);
                }
            }
        }
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return m5184a(i, i2, new ofc(runnable, runnable2, handler), false);
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.f8446e = true;
        mbb mbbVar = this.f8447f;
        if (!((HashMap) this.f8447f.f39760a).isEmpty()) {
            for (Integer num : ((HashMap) this.f8447f.f39760a).keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(f8442b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((HashMap) mbbVar.f39760a).containsKey(entry.getKey())) {
                ((ofe) ((HashMap) mbbVar.f39760a).get(entry.getKey())).m18462b(((Integer) entry.getValue()).intValue());
            } else {
                Log.e(f8442b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }
}
