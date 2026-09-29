package com.amplitude.android.internal.locators;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import p000.C3376nl;
import p000.b34;
import p000.pj5;
import p000.ui3;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class ViewTargetLocators$ALL$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final ViewTargetLocators$ALL$2 f10862b = new ViewTargetLocators$ALL$2(0);

    /* JADX INFO: renamed from: com.amplitude.android.internal.locators.ViewTargetLocators$ALL$2$1 */
    final class C08891 extends Lambda implements vi3 {

        /* JADX INFO: renamed from: b */
        public static final C08891 f10863b = new C08891(1);

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            pj5 pj5Var = (pj5) obj;
            pj5Var.getClass();
            ArrayList arrayList = new ArrayList();
            if (b34.m3253t("androidx.compose.ui.node.Owner", null) && b34.m3253t("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
                arrayList.add(new ComposeViewTargetLocator(pj5Var));
            }
            arrayList.add(new C3376nl());
            return arrayList;
        }
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo0a() {
        return C08891.f10863b;
    }
}
