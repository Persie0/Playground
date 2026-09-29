package com.lingq.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2041a;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.linguist.R;
import dm.C5207g;
import p096ei.C5408a;
import p274n8.DialogInterfaceOnClickListenerC7720e;
import p343qi.DialogInterfaceOnClickListenerC8634f;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewsUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final Theme m10415a(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        if (numValueOf != null && numValueOf.intValue() == 32) {
            return Theme.Dark;
        }
        if (numValueOf != null && numValueOf.intValue() == 16) {
            return Theme.Light;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? Theme.Light : Theme.Light;
    }

    /* JADX INFO: renamed from: b */
    public static final int m10416b(int i10, Integer num) {
        int iM11568a = C5408a.m11568a(i10, num);
        if (iM11568a == CardStatus.New.getValue()) {
            return R.attr.yellowWordColor;
        }
        if (iM11568a == CardStatus.Recognized.getValue()) {
            return R.attr.yellowWordStatus2Color;
        }
        if (iM11568a == CardStatus.Familiar.getValue()) {
            return R.attr.yellowWordStatus3Color;
        }
        if (iM11568a != CardStatus.Learned.getValue() && iM11568a != CardStatus.Known.getValue()) {
            CardStatus.Ignored.getValue();
        }
        return R.attr.yellowWordStatus4Color;
    }

    /* JADX INFO: renamed from: c */
    public static final int m10417c(int i10, Integer num) {
        int iM11568a = C5408a.m11568a(i10, num);
        if (iM11568a == CardStatus.New.getValue()) {
            return R.attr.yellowWordColorUnderlined;
        }
        if (iM11568a == CardStatus.Recognized.getValue()) {
            return R.attr.yellowWordStatus2ColorUnderlined;
        }
        if (iM11568a == CardStatus.Familiar.getValue()) {
            return R.attr.yellowWordStatus3ColorUnderlined;
        }
        if (iM11568a != CardStatus.Learned.getValue() && iM11568a != CardStatus.Known.getValue()) {
            CardStatus.Ignored.getValue();
        }
        return R.attr.yellowWordStatus4Color;
    }

    /* JADX INFO: renamed from: d */
    public static final int m10418d(String str) {
        C5207g.m11111f(str, "status");
        return (C5207g.m11106a(str, WordStatus.Ignored.getValue()) || C5207g.m11106a(str, WordStatus.Known.getValue())) ? R.attr.yellowWordStatus4Color : R.attr.blueWordColor;
    }

    /* JADX INFO: renamed from: e */
    public static final int m10419e(String str) {
        C5207g.m11111f(str, "status");
        return (C5207g.m11106a(str, WordStatus.Ignored.getValue()) || C5207g.m11106a(str, WordStatus.Known.getValue())) ? R.attr.yellowWordStatus4Color : R.attr.blueWordColorUnderlined;
    }

    /* JADX INFO: renamed from: f */
    public static void m10420f(Fragment fragment, Integer num, Integer num2, Integer num3, Integer num4, InterfaceC2041a interfaceC2041a, int i10) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        if ((i10 & 8) != 0) {
            num4 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: com.lingq.util.ViewsUtilsKt$showDialog$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                    return C9072e.f47360a;
                }
            };
        }
        ViewsUtilsKt$showDialog$2 viewsUtilsKt$showDialog$2 = (i10 & 32) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.util.ViewsUtilsKt$showDialog$2
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                return C9072e.f47360a;
            }
        } : null;
        C5207g.m11111f(fragment, "<this>");
        C5207g.m11111f(interfaceC2041a, "onPositiveButtonClicked");
        C5207g.m11111f(viewsUtilsKt$showDialog$2, "onNegativeButtonClicked");
        C9249b c9249b = new C9249b(fragment.m3578a0());
        if (num != null) {
            num.intValue();
            c9249b.m17615h(num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            int iIntValue = num2.intValue();
            AlertController.C0211b c0211b = c9249b.f599a;
            c0211b.f579f = c0211b.f574a.getText(iIntValue);
        }
        if (num3 != null) {
            num3.intValue();
            c9249b.setPositiveButton(num3.intValue(), new DialogInterfaceOnClickListenerC8634f(5, interfaceC2041a));
        }
        if (num4 != null) {
            num4.intValue();
            c9249b.setNegativeButton(num4.intValue(), new DialogInterfaceOnClickListenerC7720e(3, viewsUtilsKt$showDialog$2));
        }
        c9249b.m876a();
    }

    /* JADX INFO: renamed from: g */
    public static final void m10421g(Fragment fragment, final InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(fragment, "<this>");
        m10420f(fragment, Integer.valueOf(R.string.library_private_lesson), Integer.valueOf(R.string.library_liking_private_lesson), Integer.valueOf(R.string.ui_continue), Integer.valueOf(R.string.ui_cancel), new InterfaceC2041a<C9072e>() { // from class: com.lingq.util.ViewsUtilsKt$showPrivateLessonDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                interfaceC2041a.mo807E();
                return C9072e.f47360a;
            }
        }, 32);
    }
}
