package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.input.internal.C0189c;
import androidx.compose.foundation.text.selection.C0205f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class c28 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final or3 f9360a;

    /* JADX INFO: renamed from: b */
    public final boolean f9361b;

    /* JADX INFO: renamed from: c */
    public final yw4 f9362c;

    /* JADX INFO: renamed from: d */
    public final C0205f f9363d;

    /* JADX INFO: renamed from: e */
    public final hta f9364e;

    /* JADX INFO: renamed from: f */
    public int f9365f;

    /* JADX INFO: renamed from: g */
    public vv9 f9366g;

    /* JADX INFO: renamed from: h */
    public int f9367h;

    /* JADX INFO: renamed from: i */
    public boolean f9368i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f9369j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f9370k = true;

    public c28(vv9 vv9Var, or3 or3Var, boolean z, yw4 yw4Var, C0205f c0205f, hta htaVar) {
        this.f9360a = or3Var;
        this.f9361b = z;
        this.f9362c = yw4Var;
        this.f9363d = c0205f;
        this.f9364e = htaVar;
        this.f9366g = vv9Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4286a(uo2 uo2Var) {
        this.f9365f++;
        try {
            this.f9369j.add(uo2Var);
        } finally {
            m4287b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4287b() {
        int i = this.f9365f - 1;
        this.f9365f = i;
        if (i == 0) {
            ArrayList arrayList = this.f9369j;
            if (!arrayList.isEmpty()) {
                ((zw4) this.f9360a.f54782a).f72299c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f9365f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        this.f9365f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4288c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f9370k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9369j.clear();
        this.f9365f = 0;
        this.f9370k = false;
        ArrayList arrayList = ((zw4) this.f9360a.f54782a).f72306j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (fa4.m11650l(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f9370k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f9370k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f9370k;
        return z ? this.f9361b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f9370k;
        if (z) {
            m4286a(new hb1(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        m4286a(new ya2(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        m4286a(new za2(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m4287b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        m4286a(new k43());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        vv9 vv9Var = this.f9366g;
        return TextUtils.getCapsMode(vv9Var.f65990a.f54604b, cx9.m9924f(vv9Var.f65991b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f9368i = z;
        if (z) {
            this.f9367h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return lda.m16116b(this.f9366g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (cx9.m9921c(this.f9366g.f65991b)) {
            return null;
        }
        return AbstractC3489q9.m19784n(this.f9366g).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3489q9.m19785o(this.f9366g, i).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3489q9.m19786p(this.f9366g, i).f54604b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f9370k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m4286a(new a09(0, this.f9366g.f65990a.f54604b.length()));
                    break;
                case R.id.cut:
                    m4288c(277);
                    return false;
                case R.id.copy:
                    m4288c(278);
                    return false;
                case R.id.paste:
                    m4288c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f9370k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((zw4) this.f9360a.f54782a).f72300d.invoke(new v04(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x026d  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        C3419on c3419on;
        long jM23747h;
        String string;
        int i;
        sw9 sw9VarM25363d;
        sw9 sw9VarM25363d2;
        qw9 qw9Var;
        if (Build.VERSION.SDK_INT >= 34) {
            cg7 cg7Var = new cg7(this, 7);
            yw4 yw4Var = this.f9362c;
            int iM19520p = 3;
            if (yw4Var != null && (c3419on = yw4Var.f70578j) != null) {
                sw9 sw9VarM25363d3 = yw4Var.m25363d();
                if (c3419on.equals((sw9VarM25363d3 == null || (qw9Var = sw9VarM25363d3.f61519a.f59975a) == null) ? null : qw9Var.f58295a)) {
                    boolean zM19170s = AbstractC3461pi.m19170s(handwritingGesture);
                    C0205f c0205f = this.f9363d;
                    if (zM19170s) {
                        SelectGesture selectGestureM4135p = br3.m4135p(handwritingGesture);
                        long jM24731D = xwc.m24731D(yw4Var, bna.m3986y0(selectGestureM4135p.getSelectionArea()), selectGestureM4135p.getGranularity() != 1 ? 0 : 1);
                        if (cx9.m9921c(jM24731D)) {
                            iM19520p = pvc.m19520p(br3.m4131l(selectGestureM4135p), cg7Var);
                        } else {
                            cg7Var.invoke(new a09((int) (jM24731D >> 32), (int) (jM24731D & 4294967295L)));
                            if (c0205f != null) {
                                c0205f.m1107h(true);
                            }
                            iM19520p = 1;
                        }
                    } else if (br3.m4117B(handwritingGesture)) {
                        DeleteGesture deleteGestureM4129j = br3.m4129j(handwritingGesture);
                        int i2 = deleteGestureM4129j.getGranularity() != 1 ? 0 : 1;
                        long jM24731D2 = xwc.m24731D(yw4Var, bna.m3986y0(deleteGestureM4129j.getDeletionArea()), i2);
                        if (cx9.m9921c(jM24731D2)) {
                            iM19520p = pvc.m19520p(br3.m4131l(deleteGestureM4129j), cg7Var);
                        } else {
                            pvc.m19530z(jM24731D2, c3419on, i2 == 1, cg7Var);
                            iM19520p = 1;
                        }
                    } else if (br3.m4118C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM4136q = br3.m4136q(handwritingGesture);
                        long jM24764f = xwc.m24764f(yw4Var, bna.m3986y0(selectRangeGestureM4136q.getSelectionStartArea()), bna.m3986y0(selectRangeGestureM4136q.getSelectionEndArea()), selectRangeGestureM4136q.getGranularity() != 1 ? 0 : 1);
                        if (cx9.m9921c(jM24764f)) {
                            iM19520p = pvc.m19520p(br3.m4131l(selectRangeGestureM4136q), cg7Var);
                        } else {
                            cg7Var.invoke(new a09((int) (jM24764f >> 32), (int) (jM24764f & 4294967295L)));
                            if (c0205f != null) {
                                c0205f.m1107h(true);
                            }
                            iM19520p = 1;
                        }
                    } else if (br3.m4119D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM4130k = br3.m4130k(handwritingGesture);
                        int i3 = deleteRangeGestureM4130k.getGranularity() != 1 ? 0 : 1;
                        long jM24764f2 = xwc.m24764f(yw4Var, bna.m3986y0(deleteRangeGestureM4130k.getDeletionStartArea()), bna.m3986y0(deleteRangeGestureM4130k.getDeletionEndArea()), i3);
                        if (cx9.m9921c(jM24764f2)) {
                            iM19520p = pvc.m19520p(br3.m4131l(deleteRangeGestureM4130k), cg7Var);
                        } else {
                            pvc.m19530z(jM24764f2, c3419on, i3 == 1, cg7Var);
                            iM19520p = 1;
                        }
                    } else {
                        boolean zM4116A = br3.m4116A(handwritingGesture);
                        hta htaVar = this.f9364e;
                        if (zM4116A) {
                            JoinOrSplitGesture joinOrSplitGestureM4133n = br3.m4133n(handwritingGesture);
                            if (htaVar == null) {
                                iM19520p = pvc.m19520p(br3.m4144y(joinOrSplitGestureM4133n), cg7Var);
                            } else {
                                int iM24762e = xwc.m24762e(yw4Var, xwc.m24768h(joinOrSplitGestureM4133n.getJoinOrSplitPoint()), htaVar);
                                if (iM24762e == -1 || ((sw9VarM25363d2 = yw4Var.m25363d()) != null && xwc.m24766g(sw9VarM25363d2.f61519a, iM24762e))) {
                                    iM19520p = pvc.m19520p(br3.m4131l(joinOrSplitGestureM4133n), cg7Var);
                                } else {
                                    int iCharCount = iM24762e;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(c3419on, iCharCount);
                                        if (!xwc.m24739L(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iM24762e < c3419on.f54604b.length()) {
                                        int iCodePointAt = Character.codePointAt(c3419on, iM24762e);
                                        if (!xwc.m24739L(iCodePointAt)) {
                                            break;
                                        } else {
                                            iM24762e += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jM11127g = eh0.m11127g(iCharCount, iM24762e);
                                    if (cx9.m9921c(jM11127g)) {
                                        int i4 = (int) (jM11127g >> 32);
                                        cg7Var.invoke(new cr3(new uo2[]{new a09(i4, i4), new hb1(" ", 1)}));
                                    } else {
                                        pvc.m19530z(jM11127g, c3419on, false, cg7Var);
                                    }
                                    iM19520p = 1;
                                }
                            }
                        } else if (br3.m4139t(handwritingGesture)) {
                            InsertGesture insertGestureM4132m = br3.m4132m(handwritingGesture);
                            if (htaVar == null) {
                                iM19520p = pvc.m19520p(br3.m4144y(insertGestureM4132m), cg7Var);
                            } else {
                                int iM24762e2 = xwc.m24762e(yw4Var, xwc.m24768h(insertGestureM4132m.getInsertionPoint()), htaVar);
                                if (iM24762e2 == -1 || ((sw9VarM25363d = yw4Var.m25363d()) != null && xwc.m24766g(sw9VarM25363d.f61519a, iM24762e2))) {
                                    iM19520p = pvc.m19520p(br3.m4131l(insertGestureM4132m), cg7Var);
                                } else {
                                    cg7Var.invoke(new cr3(new uo2[]{new a09(iM24762e2, iM24762e2), new hb1(insertGestureM4132m.getTextToInsert(), 1)}));
                                    iM19520p = 1;
                                }
                            }
                        } else if (br3.m4145z(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM4134o = br3.m4134o(handwritingGesture);
                            sw9 sw9VarM25363d4 = yw4Var.m25363d();
                            rw9 rw9Var = sw9VarM25363d4 != null ? sw9VarM25363d4.f61519a : null;
                            long jM24768h = xwc.m24768h(removeSpaceGestureM4134o.getStartPoint());
                            long jM24768h2 = xwc.m24768h(removeSpaceGestureM4134o.getEndPoint());
                            aq4 aq4VarM25362c = yw4Var.m25362c();
                            if (rw9Var != null) {
                                w46 w46Var = rw9Var.f59976b;
                                if (aq4VarM25362c == null) {
                                    jM23747h = cx9.f34692b;
                                } else {
                                    long jMo1668L = aq4VarM25362c.mo1668L(jM24768h);
                                    long jMo1668L2 = aq4VarM25362c.mo1668L(jM24768h2);
                                    int iM24729B = xwc.m24729B(w46Var, jMo1668L, htaVar);
                                    int iM24729B2 = xwc.m24729B(w46Var, jMo1668L2, htaVar);
                                    if (iM24729B != -1) {
                                        if (iM24729B2 != -1) {
                                            iM24729B = Math.min(iM24729B, iM24729B2);
                                        }
                                        iM24729B2 = iM24729B;
                                    } else if (iM24729B2 == -1) {
                                        jM23747h = cx9.f34692b;
                                    }
                                    float fM23741b = (w46Var.m23741b(iM24729B2) + w46Var.m23745f(iM24729B2)) / 2.0f;
                                    int i5 = (int) (jMo1668L >> 32);
                                    int i6 = (int) (jMo1668L2 >> 32);
                                    jM23747h = w46Var.m23747h(new e28(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fM23741b - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fM23741b + 0.1f), 0, s46.f60291f);
                                }
                            } else {
                                jM23747h = cx9.f34692b;
                            }
                            if (cx9.m9921c(jM23747h)) {
                                iM19520p = pvc.m19520p(br3.m4131l(removeSpaceGestureM4134o), cg7Var);
                            } else {
                                Ref$IntRef ref$IntRef = new Ref$IntRef();
                                ref$IntRef.f47716a = -1;
                                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                ref$IntRef2.f47716a = -1;
                                String str = c3419on.subSequence(cx9.m9924f(jM23747h), cx9.m9923e(jM23747h)).f54604b;
                                Regex regex = new Regex("\\s+");
                                ke2 ke2Var = new ke2(5, ref$IntRef, ref$IntRef2);
                                str.getClass();
                                dr5 dr5VarM15424b = regex.m15424b(str);
                                if (dr5VarM15424b == null) {
                                    string = str.toString();
                                } else {
                                    int length = str.length();
                                    StringBuilder sb = new StringBuilder(length);
                                    int i7 = 0;
                                    do {
                                        sb.append((CharSequence) str, i7, dr5VarM15424b.m10611b().f40379a);
                                        ke2Var.invoke(dr5VarM15424b);
                                        sb.append((CharSequence) "");
                                        i7 = dr5VarM15424b.m10611b().f40380b + 1;
                                        dr5VarM15424b = dr5VarM15424b.m10613d();
                                        if (i7 >= length) {
                                            break;
                                        }
                                    } while (dr5VarM15424b != null);
                                    if (i7 < length) {
                                        sb.append((CharSequence) str, i7, length);
                                    }
                                    string = sb.toString();
                                }
                                int i8 = ref$IntRef.f47716a;
                                if (i8 == -1 || (i = ref$IntRef2.f47716a) == -1) {
                                    iM19520p = pvc.m19520p(br3.m4131l(removeSpaceGestureM4134o), cg7Var);
                                } else {
                                    int i9 = (int) (jM23747h >> 32);
                                    String strSubstring = string.substring(i8, string.length() - (cx9.m9922d(jM23747h) - ref$IntRef2.f47716a));
                                    a09 a09Var = new a09(i9 + i8, i9 + i);
                                    iM19520p = 1;
                                    cg7Var.invoke(new cr3(new uo2[]{a09Var, new hb1(strSubstring, 1)}));
                                }
                            }
                        } else {
                            iM19520p = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC2971eo(intConsumer, iM19520p, 0));
            } else {
                intConsumer.accept(iM19520p);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f9370k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        yw4 yw4Var;
        C3419on c3419on;
        qw9 qw9Var;
        if (Build.VERSION.SDK_INT >= 34 && (yw4Var = this.f9362c) != null && (c3419on = yw4Var.f70578j) != null) {
            sw9 sw9VarM25363d = yw4Var.m25363d();
            if (c3419on.equals((sw9VarM25363d == null || (qw9Var = sw9VarM25363d.f61519a.f59975a) == null) ? null : qw9Var.f58295a)) {
                boolean zM19170s = AbstractC3461pi.m19170s(previewableHandwritingGesture);
                int i = 1;
                C0205f c0205f = this.f9363d;
                if (zM19170s) {
                    SelectGesture selectGestureM4135p = br3.m4135p(previewableHandwritingGesture);
                    if (c0205f != null) {
                        long jM24731D = xwc.m24731D(yw4Var, bna.m3986y0(selectGestureM4135p.getSelectionArea()), selectGestureM4135p.getGranularity() != 1 ? 0 : 1);
                        yw4 yw4Var2 = c0205f.f3079d;
                        if (yw4Var2 != null) {
                            yw4Var2.m25365f(jM24731D);
                        }
                        yw4 yw4Var3 = c0205f.f3079d;
                        if (yw4Var3 != null) {
                            yw4Var3.m25364e(cx9.f34692b);
                        }
                        if (!cx9.m9921c(jM24731D)) {
                            c0205f.m1120u(false);
                            c0205f.m1117r(HandleState.None);
                        }
                    }
                } else if (br3.m4117B(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM4129j = br3.m4129j(previewableHandwritingGesture);
                    if (c0205f != null) {
                        long jM24731D2 = xwc.m24731D(yw4Var, bna.m3986y0(deleteGestureM4129j.getDeletionArea()), deleteGestureM4129j.getGranularity() != 1 ? 0 : 1);
                        yw4 yw4Var4 = c0205f.f3079d;
                        if (yw4Var4 != null) {
                            yw4Var4.m25364e(jM24731D2);
                        }
                        yw4 yw4Var5 = c0205f.f3079d;
                        if (yw4Var5 != null) {
                            yw4Var5.m25365f(cx9.f34692b);
                        }
                        if (!cx9.m9921c(jM24731D2)) {
                            c0205f.m1120u(false);
                            c0205f.m1117r(HandleState.None);
                        }
                    }
                } else if (br3.m4118C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureM4136q = br3.m4136q(previewableHandwritingGesture);
                    if (c0205f != null) {
                        long jM24764f = xwc.m24764f(yw4Var, bna.m3986y0(selectRangeGestureM4136q.getSelectionStartArea()), bna.m3986y0(selectRangeGestureM4136q.getSelectionEndArea()), selectRangeGestureM4136q.getGranularity() != 1 ? 0 : 1);
                        yw4 yw4Var6 = c0205f.f3079d;
                        if (yw4Var6 != null) {
                            yw4Var6.m25365f(jM24764f);
                        }
                        yw4 yw4Var7 = c0205f.f3079d;
                        if (yw4Var7 != null) {
                            yw4Var7.m25364e(cx9.f34692b);
                        }
                        if (!cx9.m9921c(jM24764f)) {
                            c0205f.m1120u(false);
                            c0205f.m1117r(HandleState.None);
                        }
                    }
                } else if (br3.m4119D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureM4130k = br3.m4130k(previewableHandwritingGesture);
                    if (c0205f != null) {
                        long jM24764f2 = xwc.m24764f(yw4Var, bna.m3986y0(deleteRangeGestureM4130k.getDeletionStartArea()), bna.m3986y0(deleteRangeGestureM4130k.getDeletionEndArea()), deleteRangeGestureM4130k.getGranularity() != 1 ? 0 : 1);
                        yw4 yw4Var8 = c0205f.f3079d;
                        if (yw4Var8 != null) {
                            yw4Var8.m25364e(jM24764f2);
                        }
                        yw4 yw4Var9 = c0205f.f3079d;
                        if (yw4Var9 != null) {
                            yw4Var9.m25365f(cx9.f34692b);
                        }
                        if (!cx9.m9921c(jM24764f2)) {
                            c0205f.m1120u(false);
                            c0205f.m1117r(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new pe1(c0205f, i));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C0189c c0189c;
        boolean z4 = this.f9370k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            c0189c = ((zw4) this.f9360a.f54782a).f72309m;
            synchronized (c0189c.f2949c) {
                try {
                    c0189c.f2952f = z2;
                    c0189c.f2953g = z3;
                    c0189c.f2954h = z5;
                    c0189c.f2955i = z;
                    if (z6) {
                        c0189c.f2951e = true;
                        if (c0189c.f2956j != null) {
                            c0189c.m1091a();
                        }
                    }
                    c0189c.f2950d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c0189c = ((zw4) this.f9360a.f54782a).f72309m;
        synchronized (c0189c.f2949c) {
            c0189c.f2952f = z2;
            c0189c.f2953g = z3;
            c0189c.f2954h = z5;
            c0189c.f2955i = z;
            if (z6) {
                c0189c.f2951e = true;
                if (c0189c.f2956j != null) {
                    c0189c.m1091a();
                }
            }
            c0189c.f2950d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((zw4) this.f9360a.f54782a).f72307k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f9370k;
        if (z) {
            m4286a(new pz8(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f9370k;
        if (z) {
            m4286a(new qz8(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f9370k;
        if (!z) {
            return z;
        }
        m4286a(new a09(i, i2));
        return true;
    }
}
