package p000;

import android.content.DialogInterface;
import com.lingq.feature.library.preview.LessonPreviewFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o55 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPreviewFragment f53864b;

    public /* synthetic */ o55(LessonPreviewFragment lessonPreviewFragment, int i) {
        this.f53863a = i;
        this.f53864b = lessonPreviewFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f53863a;
        LessonPreviewFragment lessonPreviewFragment = this.f53864b;
        switch (i2) {
            case 0:
                bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                dialogInterface.dismiss();
                b34.m3244j(lessonPreviewFragment).m22689f();
                break;
            case 1:
                bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
                dialogInterface.dismiss();
                lessonPreviewFragment.m9084j0();
                break;
            default:
                bh4[] bh4VarArr3 = LessonPreviewFragment.f26702G0;
                dialogInterface.dismiss();
                b34.m3244j(lessonPreviewFragment).m22689f();
                break;
        }
    }
}
