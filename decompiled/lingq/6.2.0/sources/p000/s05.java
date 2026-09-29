package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final class s05 extends se5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f60131e = 1;

    /* JADX INFO: renamed from: f */
    public final Object f60132f;

    public s05(vj6 vj6Var) {
        super(new ve2(1));
        this.f60132f = vj6Var;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        String str;
        String string;
        switch (this.f60131e) {
            case 0:
                final r05 r05Var = (r05) o38Var;
                LessonWord lessonWord = (LessonWord) m21308k(i);
                lessonWord.getClass();
                cq4 cq4Var = r05Var.f58440u;
                cq4Var.f34378b.setText(lessonWord.f19314a);
                TextView textView = cq4Var.f34377a;
                TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(lessonWord.f19319f);
                if (tokenMeaning == null || (str = tokenMeaning.f19596c) == null) {
                    str = "";
                }
                textView.setText(str);
                final int i2 = 0;
                ((ConstraintLayout) cq4Var.f34382f).setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.tutorial.a
                    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01b4  */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
                          (r5v9 java.lang.Object) from 0x0191: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:45:0x0190, B:58:0x0191] A[DONT_GENERATE, DONT_INLINE]
                          (r5v9 java.lang.Object) from 0x0187: CHECK_CAST (xz7) (r5v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r12) {
                        /*
                            Method dump skipped, instruction units count: 476
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.tutorial.ViewOnClickListenerC2456a.onClick(android.view.View):void");
                    }
                });
                final int i3 = 1;
                ((ImageButton) cq4Var.f34380d).setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.tutorial.a
                    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01b4  */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
                          (r5v9 java.lang.Object) from 0x0191: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:45:0x0190, B:58:0x0191] A[DONT_GENERATE, DONT_INLINE]
                          (r5v9 java.lang.Object) from 0x0187: CHECK_CAST (xz7) (r5v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r12) {
                        /*
                            Method dump skipped, instruction units count: 476
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.tutorial.ViewOnClickListenerC2456a.onClick(android.view.View):void");
                    }
                });
                final int i4 = 2;
                ((ImageButton) cq4Var.f34381e).setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.tutorial.a
                    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01b4  */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
                          (r5v9 java.lang.Object) from 0x0191: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:45:0x0190, B:58:0x0191] A[DONT_GENERATE, DONT_INLINE]
                          (r5v9 java.lang.Object) from 0x0187: CHECK_CAST (xz7) (r5v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r12) {
                        /*
                            Method dump skipped, instruction units count: 476
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.tutorial.ViewOnClickListenerC2456a.onClick(android.view.View):void");
                    }
                });
                break;
            default:
                final y45 y45Var = (y45) o38Var;
                LessonWord lessonWord2 = (LessonWord) m21308k(i);
                lessonWord2.getClass();
                ff5 ff5Var = y45Var.f69276u;
                ((TextView) ff5Var.f38998d).setText(lessonWord2.f19314a);
                TextView textView2 = (TextView) ff5Var.f38996b;
                TokenMeaning tokenMeaning2 = (TokenMeaning) u91.m22591I0(lessonWord2.f19319f);
                if (tokenMeaning2 == null || (string = tokenMeaning2.f19596c) == null) {
                    string = y45Var.f53781a.getContext().getString(R$string.ui_loading);
                    string.getClass();
                }
                textView2.setText(string);
                final int i5 = 3;
                ((ImageButton) ff5Var.f38995a).setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.tutorial.a
                    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01b4  */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
                          (r5v9 java.lang.Object) from 0x0191: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:45:0x0190, B:58:0x0191] A[DONT_GENERATE, DONT_INLINE]
                          (r5v9 java.lang.Object) from 0x0187: CHECK_CAST (xz7) (r5v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r12) {
                        /*
                            Method dump skipped, instruction units count: 476
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.tutorial.ViewOnClickListenerC2456a.onClick(android.view.View):void");
                    }
                });
                break;
        }
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        switch (this.f60131e) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_lesson_deal_with_words, viewGroup, false);
                int i2 = R$id.btnHintAdd;
                if (((ImageButton) lfa.m16159c(viewInflate, i2)) != null) {
                    i2 = R$id.btnStatusWordIgnore;
                    ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate, i2);
                    if (imageButton != null) {
                        i2 = R$id.btnStatusWordKnown;
                        ImageButton imageButton2 = (ImageButton) lfa.m16159c(viewInflate, i2);
                        if (imageButton2 != null) {
                            i2 = R$id.tvMeaning;
                            TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                            if (textView != null) {
                                i2 = R$id.tvTerm;
                                TextView textView2 = (TextView) lfa.m16159c(viewInflate, i2);
                                if (textView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i2 = R$id.viewTerm;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) lfa.m16159c(viewInflate, i2);
                                    if (constraintLayout2 != null) {
                                        i2 = R$id.viewWordStatus;
                                        if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                            return new r05(new cq4(constraintLayout, imageButton, imageButton2, textView, textView2, constraintLayout2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_reader_move_known, viewGroup, false);
                int i3 = R$id.btnHintAdd;
                ImageButton imageButton3 = (ImageButton) lfa.m16159c(viewInflate2, i3);
                if (imageButton3 != null) {
                    i3 = R$id.tvMeaning;
                    TextView textView3 = (TextView) lfa.m16159c(viewInflate2, i3);
                    if (textView3 != null) {
                        i3 = R$id.tvTerm;
                        TextView textView4 = (TextView) lfa.m16159c(viewInflate2, i3);
                        if (textView4 != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate2;
                            int i4 = R$id.viewTerm;
                            if (((ConstraintLayout) lfa.m16159c(viewInflate2, i4)) != null) {
                                return new y45(new ff5(constraintLayout3, imageButton3, textView3, textView4));
                            }
                            i3 = i4;
                        }
                    }
                }
                C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
                return null;
        }
    }

    public s05(ck6 ck6Var) {
        super(new ve2(2));
        this.f60132f = ck6Var;
    }
}
