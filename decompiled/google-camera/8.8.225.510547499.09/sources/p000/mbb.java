package p000;

import android.animation.ValueAnimator;
import android.content.ContentProviderClient;
import android.graphics.Rect;
import androidx.wear.ambient.AmbientMode;
import com.google.mediapipe.framework.Packet;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbb {

    /* JADX INFO: renamed from: a */
    public final Object f39760a;

    /* JADX INFO: renamed from: b */
    public final Object f39761b;

    public mbb(ContentProviderClient contentProviderClient, String str) {
        this.f39760a = contentProviderClient;
        this.f39761b = str;
    }

    public mbb(Packet packet, Long l) {
        this.f39761b = packet;
        this.f39760a = l;
    }

    public mbb(lqq lqqVar, byte[] bArr, byte[] bArr2) {
        this.f39760a = null;
        this.f39761b = lqqVar;
    }

    public mbb(mrm mrmVar, lme lmeVar, lvg lvgVar, lzd lzdVar, lvh lvhVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        lmeVar.getClass();
        lvgVar.getClass();
        lzdVar.getClass();
        lvhVar.getClass();
        this.f39761b = lvgVar;
        this.f39760a = lkm.m15593t(new C0910po(mrmVar, 16));
    }

    public mbb(ncn ncnVar, ncm ncmVar) {
        this.f39761b = ncnVar;
        this.f39760a = ncmVar;
    }

    public mbb(oeq oeqVar) {
        this.f39760a = oeqVar;
        this.f39761b = null;
    }

    public mbb(char[] cArr) {
        this.f39760a = new HashMap();
        this.f39761b = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    private static final lvi m16289c(ojy ojyVar) {
        return (lvi) ojyVar.mo18586a();
    }

    /* JADX INFO: renamed from: d */
    private static final lwh m16290d(ojy ojyVar) {
        return (lwh) ojyVar.mo18586a();
    }

    /* JADX INFO: renamed from: e */
    private static final File m16291e(ojy ojyVar) {
        return (File) ojyVar.mo18586a();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0193  */
    /* JADX WARN: Code duplicated, block: B:49:0x019b  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x021c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0243  */
    /* JADX WARN: Code duplicated, block: B:68:0x0247  */
    /* JADX WARN: Code duplicated, block: B:70:0x024b  */
    /* JADX WARN: Code duplicated, block: B:72:0x027a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x027e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0287  */
    /* JADX WARN: Code duplicated, block: B:77:0x028b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0291  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0148 -> B:80:0x0299). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0243 -> B:74:0x027c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0278 -> B:73:0x027b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0291 -> B:80:0x0299). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m16292a(p000.mau r17, java.util.List r18, p000.ols r19) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mbb.m16292a(mau, java.util.List, ols):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m16293b(ValueAnimator valueAnimator) {
        lij lijVar = new lij((byte[]) null);
        valueAnimator.addListener(this.f39761b);
        ((ArrayList) this.f39760a).add(lijVar);
    }

    public mbb(mav mavVar, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2) {
        mavVar.getClass();
        ambientController.getClass();
        this.f39760a = mavVar;
        this.f39761b = ambientController;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public mbb(mbb mbbVar, byte[] bArr, byte[] bArr2) {
        this.f39760a = new HashMap((Map) mbbVar.f39760a);
        HashMap map = new HashMap((Map) mbbVar.f39761b);
        this.f39761b = map;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((ofe) ((Map.Entry) it.next()).getValue()).f45837e.get()) {
                it.remove();
            }
        }
    }

    public mbb(byte[] bArr, byte[] bArr2) {
        this.f39760a = new Rect();
        this.f39761b = new Rect();
    }

    public mbb() {
        this.f39760a = new ArrayList();
        this.f39761b = new miz(this, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public mbb(Set set) {
        this.f39760a = set;
        this.f39761b = new boolean[256];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.f39761b)[i] = this.f39760a.contains(Integer.valueOf(i));
        }
    }
}
