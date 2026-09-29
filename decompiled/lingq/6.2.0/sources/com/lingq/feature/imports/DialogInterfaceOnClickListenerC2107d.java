package com.lingq.feature.imports;

import android.content.DialogInterface;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.DialogInterfaceC0016ae;
import p000.lda;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.imports.d */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC2107d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserImportFragment f26151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f26152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lesson f26153c;

    public DialogInterfaceOnClickListenerC2107d(UserImportFragment userImportFragment, Ref$ObjectRef ref$ObjectRef, Lesson lesson) {
        this.f26151a = userImportFragment;
        this.f26152b = ref$ObjectRef;
        this.f26153c = lesson;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserImportFragment userImportFragment = this.f26151a;
        if (userImportFragment.m2115q()) {
            DialogInterfaceC0016ae dialogInterfaceC0016ae = (DialogInterfaceC0016ae) this.f26152b.f47718a;
            if (dialogInterfaceC0016ae != null) {
                dialogInterfaceC0016ae.dismiss();
            }
            C2109f c2109fM8997R0 = userImportFragment.m8997R0();
            c2109fM8997R0.getClass();
            Lesson lesson = this.f26153c;
            lesson.getClass();
            wfb.m23926u(lda.m16103C(c2109fM8997R0), null, null, new UserImportViewModel$openLesson$1(c2109fM8997R0, lesson, null), 3);
        }
    }
}
