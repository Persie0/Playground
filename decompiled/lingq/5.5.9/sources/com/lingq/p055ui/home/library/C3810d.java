package com.lingq.p055ui.home.library;

import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.lingq.util.C4924a;
import dm.C5207g;
import p171i6.InterfaceC6201f;
import ph.C8343p3;

/* JADX INFO: renamed from: com.lingq.ui.home.library.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3810d implements InterfaceC6201f<Bitmap> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8343p3 f25011b;

    public C3810d(String str, C8343p3 c8343p3) {
        this.f25010a = str;
        this.f25011b = c8343p3;
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: c */
    public final void mo9953c(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        if (C5207g.m11106a(obj2, this.f25010a)) {
            RelativeLayout relativeLayout = this.f25011b.f45158k;
            C5207g.m11110e(relativeLayout, "viewBg");
            C4924a.m10451b0(relativeLayout, bitmap);
        }
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: d */
    public final void mo9954d(GlideException glideException) {
        if (glideException != null) {
            glideException.m6303e("error lesson load image");
        }
    }
}
