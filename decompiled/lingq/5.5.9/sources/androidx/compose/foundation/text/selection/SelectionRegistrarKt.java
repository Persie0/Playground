package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import cm.InterfaceC2041a;
import java.util.Map;
import p001a0.C0003b;
import p001a0.InterfaceC0004c;
import p081e0.C5331q;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionRegistrarKt {

    /* JADX INFO: renamed from: a */
    public static final C5331q f2569a = CompositionLocalKt.m1692b(new InterfaceC2041a<InterfaceC0004c>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$LocalSelectionRegistrar$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final /* bridge */ /* synthetic */ InterfaceC0004c mo807E() {
            return null;
        }
    });

    /* JADX INFO: renamed from: a */
    public static final boolean m1546a(InterfaceC0004c interfaceC0004c, long j10) {
        Map<Long, C0003b> mapM12h;
        if (interfaceC0004c == null || (mapM12h = interfaceC0004c.m12h()) == null) {
            return false;
        }
        return mapM12h.containsKey(Long.valueOf(j10));
    }
}
