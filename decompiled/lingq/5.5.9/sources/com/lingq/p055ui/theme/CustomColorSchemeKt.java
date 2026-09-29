package com.lingq.p055ui.theme;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import p081e0.C5304d1;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p098ek.C5422b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomColorSchemeKt {

    /* JADX INFO: renamed from: a */
    public static final C5304d1 f31156a = CompositionLocalKt.m1693c(new InterfaceC2041a<C5422b>() { // from class: com.lingq.ui.theme.CustomColorSchemeKt$LocalCustomColorScheme$1
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C5422b mo807E() {
            throw new IllegalStateException("No CustomColorScheme provided".toString());
        }
    });

    /* JADX INFO: renamed from: a */
    public static final C5422b m10359a(InterfaceC0476a interfaceC0476a) {
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        return (C5422b) interfaceC0476a.mo1648p(f31156a);
    }
}
