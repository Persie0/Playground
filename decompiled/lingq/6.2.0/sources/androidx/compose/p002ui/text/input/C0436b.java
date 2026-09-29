package androidx.compose.p002ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cc4;
import p000.cs4;
import p000.ui3;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0436b {

    /* JADX INFO: renamed from: a */
    public final View f5085a;

    /* JADX INFO: renamed from: b */
    public final cs4 f5086b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p000.ui3
        /* JADX INFO: renamed from: a */
        public final Object mo0a() {
            Object systemService = this.f5061b.f5085a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: c */
    public final cc4 f5087c;

    public C0436b(View view) {
        this.f5085a = view;
        this.f5087c = new cc4(view);
    }
}
