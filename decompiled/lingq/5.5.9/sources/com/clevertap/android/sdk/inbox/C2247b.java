package com.clevertap.android.sdk.inbox;

import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.C2181a;
import com.linguist.R;
import java.util.ArrayList;
import p408u6.C9462a;
import p408u6.C9463b;
import p408u6.C9465d;
import p408u6.C9467f;
import p408u6.C9474m;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2247b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: d */
    public final C2246a f11313d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<CTInboxMessage> f11314e;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11315a;

        static {
            int[] iArr = new int[CTInboxMessageType.values().length];
            f11315a = iArr;
            try {
                iArr[CTInboxMessageType.SimpleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11315a[CTInboxMessageType.IconMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11315a[CTInboxMessageType.CarouselMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11315a[CTInboxMessageType.CarouselImageMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2247b(ArrayList<CTInboxMessage> arrayList, C2246a c2246a) {
        C2181a.m6455h("CTInboxMessageAdapter: messages=" + arrayList);
        this.f11314e = arrayList;
        this.f11313d = c2246a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f11314e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        int i11 = a.f11315a[this.f11314e.get(i10).f11274K.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 != 3) {
            return i11 != 4 ? -1 : 3;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        ((C9467f) abstractC1109b0).mo17876t(this.f11314e.get(i10), this.f11313d, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 c9474m;
        if (i10 == 0) {
            c9474m = new C9474m(C0204c.m849h(recyclerView, R.layout.inbox_simple_message_layout, recyclerView, false));
        } else if (i10 == 1) {
            c9474m = new C9465d(C0204c.m849h(recyclerView, R.layout.inbox_icon_message_layout, recyclerView, false));
        } else if (i10 == 2) {
            c9474m = new C9463b(C0204c.m849h(recyclerView, R.layout.inbox_carousel_text_layout, recyclerView, false));
        } else {
            if (i10 != 3) {
                return null;
            }
            c9474m = new C9462a(C0204c.m849h(recyclerView, R.layout.inbox_carousel_layout, recyclerView, false));
        }
        return c9474m;
    }
}
