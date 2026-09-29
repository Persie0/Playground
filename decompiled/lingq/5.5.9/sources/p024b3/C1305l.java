package p024b3;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p471x2.C10030c;
import p471x2.InterfaceC10062s;

/* JADX INFO: renamed from: b3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1305l implements InterfaceC10062s {
    @Override // p471x2.InterfaceC10062s
    /* JADX INFO: renamed from: a */
    public final C10030c mo4864a(View view, C10030c c10030c) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c10030c);
        }
        if (c10030c.f51012a.mo18786j() == 2) {
            return c10030c;
        }
        C10030c.e eVar = c10030c.f51012a;
        ClipData clipDataMo18783a = eVar.mo18783a();
        int iMo18785i = eVar.mo18785i();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < clipDataMo18783a.getItemCount(); i10++) {
            ClipData.Item itemAt = clipDataMo18783a.getItemAt(i10);
            if ((iMo18785i & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
