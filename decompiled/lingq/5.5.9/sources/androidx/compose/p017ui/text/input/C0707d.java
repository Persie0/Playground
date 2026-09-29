package androidx.compose.p017ui.text.input;

import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.p017ui.platform.AndroidComposeView;
import androidx.compose.p017ui.text.C0689a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p231l1.C7217k;
import p352r1.C8706g;
import p352r1.C8707h;
import p352r1.InterfaceC8704e;
import p352r1.InterfaceC8711l;
import p352r1.InterfaceC8715p;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0707d implements InterfaceC8715p {

    /* JADX INFO: renamed from: a */
    public final View f4665a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8711l f4666b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<? super List<? extends InterfaceC8704e>, C9072e> f4667c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2052l<? super C8706g, C9072e> f4668d;

    /* JADX INFO: renamed from: e */
    public final TextFieldValue f4669e;

    /* JADX INFO: renamed from: f */
    public final C8707h f4670f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4671g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC9070c f4672h;

    public C0707d(AndroidComposeView androidComposeView, InterfaceC8711l interfaceC8711l) {
        C5207g.m11111f(androidComposeView, "view");
        new C0704a(androidComposeView);
        C5207g.m11110e(Choreographer.getInstance(), "getInstance()");
        this.f4665a = androidComposeView;
        this.f4666b = interfaceC8711l;
        this.f4667c = TextInputServiceAndroid$onEditCommand$1.f4653b;
        this.f4668d = TextInputServiceAndroid$onImeActionPerformed$1.f4654b;
        this.f4669e = new TextFieldValue(new C0689a(""), C7217k.f40596b, null);
        this.f4670f = C8707h.f46293f;
        this.f4671g = new ArrayList();
        this.f4672h = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final BaseInputConnection mo807E() {
                return new BaseInputConnection(this.f4652b.f4665a, false);
            }
        });
    }
}
