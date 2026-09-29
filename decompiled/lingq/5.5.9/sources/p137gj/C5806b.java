package p137gj;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.view.Lifecycle;
import com.bumptech.glide.load.engine.GlideException;
import com.lingq.p055ui.info.LessonInfoFragment;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import p171i6.InterfaceC6201f;

/* JADX INFO: renamed from: gj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5806b implements InterfaceC6201f<Bitmap> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f35082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonInfoFragment f35083b;

    public C5806b(String str, LessonInfoFragment lessonInfoFragment) {
        this.f35082a = str;
        this.f35083b = lessonInfoFragment;
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: c */
    public final void mo9953c(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        if (C5207g.m11106a(obj2, this.f35082a)) {
            LessonInfoFragment lessonInfoFragment = this.f35083b;
            if (lessonInfoFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                ImageView imageView = lessonInfoFragment.m10098w0().f45049F;
                C5207g.m11110e(imageView, "binding.viewBg");
                C4924a.m10451b0(imageView, bitmap);
            }
        }
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: d */
    public final void mo9954d(GlideException glideException) {
    }
}
