package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abr {
    /* JADX INFO: renamed from: a */
    public static void m146a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    /* JADX INFO: renamed from: b */
    public static void m147b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX INFO: renamed from: c */
    public static boolean m148c(Editable editable, KeyEvent keyEvent, boolean z) {
        aiy[] aiyVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!m150e(selectionStart, selectionEnd) && (aiyVarArr = (aiy[]) editable.getSpans(selectionStart, selectionEnd, aiy.class)) != null && (aiyVarArr.length) > 0) {
                for (aiy aiyVar : aiyVarArr) {
                    int spanStart = editable.getSpanStart(aiyVar);
                    int spanEnd = editable.getSpanEnd(aiyVar);
                    if (z) {
                        if (spanStart != selectionStart) {
                            if (selectionStart > spanStart || selectionStart >= spanEnd) {
                            }
                        }
                    } else if (spanEnd != selectionStart) {
                        if (selectionStart > spanStart) {
                        }
                    }
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c A[EDGE_INSN: B:17:0x002c->B:39:0x005f BREAK  A[LOOP:2: B:19:0x002f->B:103:0x002f]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0070 A[EDGE_INSN: B:44:0x0070->B:65:0x00a7 BREAK  A[LOOP:1: B:46:0x0073->B:91:0x0073]] */
    /* JADX INFO: renamed from: d */
    public static boolean m149d(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (m150e(selectionStart, selectionEnd)) {
            return false;
        }
        if (z) {
            int iMax = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                selectionStart = -1;
                break;
            }
            boolean z2 = false;
            while (iMax != 0) {
                selectionStart--;
                if (selectionStart < 0) {
                    if (!z2) {
                        selectionStart = 0;
                        break;
                    }
                    selectionStart = -1;
                    break;
                }
                char cCharAt = editable.charAt(selectionStart);
                if (z2) {
                    if (!Character.isHighSurrogate(cCharAt)) {
                        selectionStart = -1;
                        break;
                    }
                    iMax--;
                    z2 = false;
                } else if (!Character.isSurrogate(cCharAt)) {
                    iMax--;
                } else {
                    if (Character.isHighSurrogate(cCharAt)) {
                        selectionStart = -1;
                        break;
                    }
                    z2 = true;
                }
            }
            int iMax2 = Math.max(i2, 0);
            iMin = editable.length();
            if (selectionEnd < 0 || iMin < selectionEnd || iMax2 < 0) {
                iMin = -1;
                break;
            }
            boolean z3 = false;
            while (true) {
                if (iMax2 == 0) {
                    iMin = selectionEnd;
                    break;
                }
                if (selectionEnd >= iMin) {
                    if (!z3) {
                        break;
                    }
                    iMin = -1;
                    break;
                }
                char cCharAt2 = editable.charAt(selectionEnd);
                if (z3) {
                    if (!Character.isLowSurrogate(cCharAt2)) {
                        iMin = -1;
                        break;
                    }
                    selectionEnd++;
                    iMax2--;
                    z3 = false;
                } else if (!Character.isSurrogate(cCharAt2)) {
                    selectionEnd++;
                    iMax2--;
                } else {
                    if (Character.isLowSurrogate(cCharAt2)) {
                        iMin = -1;
                        break;
                    }
                    selectionEnd++;
                    z3 = true;
                }
            }
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            iMin = Math.min(selectionEnd + i2, editable.length());
        }
        aiy[] aiyVarArr = (aiy[]) editable.getSpans(selectionStart, iMin, aiy.class);
        if (aiyVarArr == null || (aiyVarArr.length) <= 0) {
            return false;
        }
        for (aiy aiyVar : aiyVarArr) {
            int spanStart = editable.getSpanStart(aiyVar);
            int spanEnd = editable.getSpanEnd(aiyVar);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m150e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
