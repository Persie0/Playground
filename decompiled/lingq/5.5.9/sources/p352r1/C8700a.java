package p352r1;

import android.view.inputmethod.EditorInfo;
import androidx.compose.p017ui.platform.AndroidComposeView;
import androidx.compose.p017ui.platform.AndroidComposeView_androidKt;
import androidx.compose.p017ui.text.input.C0706c;
import androidx.compose.p017ui.text.input.C0707d;
import androidx.compose.p017ui.text.input.TextFieldValue;
import androidx.emoji2.text.C0892f;
import dm.C5207g;
import java.lang.ref.WeakReference;
import p004a3.C0012b;
import p231l1.C7217k;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8700a implements InterfaceC8713n<a> {

    /* JADX INFO: renamed from: a */
    public static final C8700a f46284a = new C8700a();

    /* JADX INFO: renamed from: r1.a$a */
    public static final class a implements InterfaceC8712m {

        /* JADX INFO: renamed from: a */
        public final C8721v f46285a;

        /* JADX INFO: renamed from: b */
        public final C0707d f46286b;

        public a(C8721v c8721v, C0707d c0707d) {
            C5207g.m11111f(c8721v, "service");
            this.f46285a = c8721v;
            this.f46286b = c0707d;
        }

        @Override // p352r1.InterfaceC8712m
        /* JADX INFO: renamed from: a */
        public final InterfaceC8720u mo16948a() {
            Object obj = this.f46285a;
            InterfaceC8720u interfaceC8720u = obj instanceof InterfaceC8720u ? (InterfaceC8720u) obj : null;
            if (interfaceC8720u != null) {
                return interfaceC8720u;
            }
            throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?".toString());
        }

        @Override // p352r1.InterfaceC8712m
        /* JADX INFO: renamed from: b */
        public final InputConnectionC8716q mo16949b(EditorInfo editorInfo) {
            int i10;
            C5207g.m11111f(editorInfo, "outAttrs");
            C0707d c0707d = this.f46286b;
            c0707d.getClass();
            C8707h c8707h = c0707d.f4670f;
            C5207g.m11111f(c8707h, "imeOptions");
            TextFieldValue textFieldValue = c0707d.f4669e;
            C5207g.m11111f(textFieldValue, "textFieldValue");
            int i11 = c8707h.f46298e;
            boolean z10 = i11 == 1;
            boolean z11 = c8707h.f46294a;
            if (z10) {
                i10 = z11 ? 6 : 0;
            } else {
                if (i11 == 0) {
                    i10 = 1;
                } else {
                    if (i11 == 2) {
                        i10 = 2;
                    } else {
                        if (i11 == 6) {
                            i10 = 5;
                        } else {
                            if (i11 == 5) {
                                i10 = 7;
                            } else {
                                if (i11 == 3) {
                                    i10 = 3;
                                } else {
                                    if (i11 == 4) {
                                        i10 = 4;
                                    } else {
                                        if (!(i11 == 7)) {
                                            throw new IllegalStateException("invalid ImeAction".toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            editorInfo.imeOptions = i10;
            int i12 = c8707h.f46297d;
            if (i12 == 1) {
                editorInfo.inputType = 1;
            } else {
                if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else {
                    if (i12 == 3) {
                        editorInfo.inputType = 2;
                    } else {
                        if (i12 == 4) {
                            editorInfo.inputType = 3;
                        } else {
                            if (i12 == 5) {
                                editorInfo.inputType = 17;
                            } else {
                                if (i12 == 6) {
                                    editorInfo.inputType = 33;
                                } else {
                                    if (i12 == 7) {
                                        editorInfo.inputType = 129;
                                    } else {
                                        if (i12 == 8) {
                                            editorInfo.inputType = 18;
                                        } else {
                                            if (!(i12 == 9)) {
                                                throw new IllegalStateException("Invalid Keyboard Type".toString());
                                            }
                                            editorInfo.inputType = 8194;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z11) {
                int i13 = editorInfo.inputType;
                if ((i13 & 1) == 1) {
                    editorInfo.inputType = i13 | 131072;
                    if (i11 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
            }
            int i14 = editorInfo.inputType;
            boolean z12 = (i14 & 1) == 1;
            boolean z13 = c8707h.f46296c;
            if (z12) {
                int i15 = c8707h.f46295b;
                if (i15 == 1) {
                    editorInfo.inputType = i14 | 4096;
                } else {
                    if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else {
                        if (i15 == 3) {
                            editorInfo.inputType = i14 | 16384;
                        }
                    }
                }
                if (z13) {
                    editorInfo.inputType |= 32768;
                }
            }
            int i16 = C7217k.f40597c;
            long j10 = textFieldValue.f4648b;
            editorInfo.initialSelStart = (int) (j10 >> 32);
            editorInfo.initialSelEnd = C7217k.m14539a(j10);
            C0012b.m51a(editorInfo, textFieldValue.f4647a.f4523a);
            editorInfo.imeOptions |= 33554432;
            if (C0892f.m3520c()) {
                C0892f.m3519a().m3528j(editorInfo);
            }
            InputConnectionC8716q inputConnectionC8716q = new InputConnectionC8716q(textFieldValue, new C0706c(c0707d), z13);
            c0707d.f4671g.add(new WeakReference(inputConnectionC8716q));
            return inputConnectionC8716q;
        }
    }

    @Override // p352r1.InterfaceC8713n
    /* JADX INFO: renamed from: a */
    public final a mo16947a(AndroidComposeView androidComposeView, InterfaceC8711l interfaceC8711l) {
        C5207g.m11111f(interfaceC8711l, "platformTextInput");
        C5207g.m11111f(androidComposeView, "view");
        C0707d c0707d = new C0707d(androidComposeView, interfaceC8711l);
        return new a(AndroidComposeView_androidKt.f4081a.mo528n(c0707d), c0707d);
    }
}
