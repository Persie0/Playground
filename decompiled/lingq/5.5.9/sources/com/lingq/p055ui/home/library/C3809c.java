package com.lingq.p055ui.home.library;

import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.lingq.util.C4924a;
import dm.C5207g;
import p171i6.InterfaceC6201f;
import ph.C8295h3;

/* JADX INFO: renamed from: com.lingq.ui.home.library.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C3809c implements InterfaceC6201f<Bitmap> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8295h3 f25009b;

    public C3809c(String str, C8295h3 c8295h3) {
        this.f25008a = str;
        this.f25009b = c8295h3;
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: c */
    public final void mo9953c(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        if (C5207g.m11106a(obj2, this.f25008a)) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f25009b.f44863m;
            C5207g.m11110e(relativeLayout, "viewBg");
            C4924a.m10451b0(relativeLayout, bitmap);
        }
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: d */
    public final void mo9954d(GlideException glideException) {
        if (glideException != null) {
            glideException.m6303e("error course load image");
        }
    }
}
