package p000;

import com.google.android.gms.internal.vision.AbstractC1034s;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzlv;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rnc implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC1034s f59599a;

    /* JADX INFO: renamed from: b */
    public AbstractC1034s f59600b;

    /* JADX INFO: renamed from: c */
    public boolean f59601c = false;

    public rnc(AbstractC1034s abstractC1034s) {
        this.f59599a = abstractC1034s;
        this.f59600b = (AbstractC1034s) abstractC1034s.mo5699e(4);
    }

    /* JADX INFO: renamed from: b */
    public static void m20720b(AbstractC1034s abstractC1034s, AbstractC1034s abstractC1034s2) {
        ovc ovcVar = ovc.f55046c;
        ovcVar.getClass();
        ovcVar.m18526a(abstractC1034s.getClass()).mo5765g(abstractC1034s, abstractC1034s2);
    }

    /* JADX INFO: renamed from: a */
    public final void m20721a(AbstractC1034s abstractC1034s) {
        if (this.f59601c) {
            m20723d();
            this.f59601c = false;
        }
        m20720b(this.f59600b, abstractC1034s);
    }

    /* JADX INFO: renamed from: c */
    public final void m20722c(byte[] bArr, int i, klc klcVar) throws zzjk {
        if (this.f59601c) {
            m20723d();
            this.f59601c = false;
        }
        try {
            ovc ovcVar = ovc.f55046c;
            AbstractC1034s abstractC1034s = this.f59600b;
            ovcVar.getClass();
            iwc iwcVarM18526a = ovcVar.m18526a(abstractC1034s.getClass());
            AbstractC1034s abstractC1034s2 = this.f59600b;
            vnb vnbVar = new vnb();
            klcVar.getClass();
            iwcVarM18526a.mo5764f(abstractC1034s2, bArr, 0, i, vnbVar);
        } catch (zzjk e) {
            throw e;
        } catch (IOException e2) {
            ij6.m13958p("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzjk.m5835a();
        }
    }

    public final /* synthetic */ Object clone() {
        rnc rncVar = (rnc) this.f59599a.mo5699e(5);
        rncVar.m20721a(m20724e());
        return rncVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m20723d() {
        AbstractC1034s abstractC1034s = (AbstractC1034s) this.f59600b.mo5699e(4);
        m20720b(abstractC1034s, this.f59600b);
        this.f59600b = abstractC1034s;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1034s m20724e() {
        boolean z = this.f59601c;
        AbstractC1034s abstractC1034s = this.f59600b;
        if (z) {
            return abstractC1034s;
        }
        ovc ovcVar = ovc.f55046c;
        ovcVar.getClass();
        ovcVar.m18526a(abstractC1034s.getClass()).mo5759a(abstractC1034s);
        this.f59601c = true;
        return this.f59600b;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1034s m20725f() {
        AbstractC1034s abstractC1034sM20724e = m20724e();
        boolean zMo5760b = true;
        byte bByteValue = ((Byte) abstractC1034sM20724e.mo5699e(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo5760b = false;
            } else {
                ovc ovcVar = ovc.f55046c;
                ovcVar.getClass();
                zMo5760b = ovcVar.m18526a(abstractC1034sM20724e.getClass()).mo5760b(abstractC1034sM20724e);
                abstractC1034sM20724e.mo5699e(2);
            }
        }
        if (zMo5760b) {
            return abstractC1034sM20724e;
        }
        throw new zzlv("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
