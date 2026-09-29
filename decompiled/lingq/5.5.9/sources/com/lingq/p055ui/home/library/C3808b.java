package com.lingq.p055ui.home.library;

import android.graphics.Bitmap;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.lingq.util.C4924a;
import dm.C5207g;
import p171i6.InterfaceC6201f;
import ph.C8377w2;

/* JADX INFO: renamed from: com.lingq.ui.home.library.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3808b implements InterfaceC6201f<Bitmap> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8377w2 f25007b;

    public C3808b(String str, C8377w2 c8377w2) {
        this.f25006a = str;
        this.f25007b = c8377w2;
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: c */
    public final void mo9953c(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        if (C5207g.m11106a(obj2, this.f25006a)) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f25007b.f45444h;
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
