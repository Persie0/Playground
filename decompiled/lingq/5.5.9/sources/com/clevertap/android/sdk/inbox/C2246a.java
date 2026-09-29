package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1152g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.C2413j;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p290o6.C7979r0;
import p290o6.InterfaceC7953e0;
import p316p6.C8192a;
import p316p6.C8193b;
import p408u6.C9471j;
import p408u6.C9473l;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a */
/* JADX INFO: loaded from: classes.dex */
public class C2246a extends Fragment {

    /* JADX INFO: renamed from: A0 */
    public RecyclerView f11300A0;

    /* JADX INFO: renamed from: B0 */
    public C2247b f11301B0;

    /* JADX INFO: renamed from: C0 */
    public CTInboxStyleConfig f11302C0;

    /* JADX INFO: renamed from: E0 */
    public WeakReference<b> f11304E0;

    /* JADX INFO: renamed from: F0 */
    public int f11305F0;

    /* JADX INFO: renamed from: G0 */
    public InterfaceC7953e0 f11306G0;

    /* JADX INFO: renamed from: v0 */
    public CleverTapInstanceConfig f11307v0;

    /* JADX INFO: renamed from: y0 */
    public LinearLayout f11310y0;

    /* JADX INFO: renamed from: z0 */
    public C8192a f11311z0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f11308w0 = C7979r0.f43406a;

    /* JADX INFO: renamed from: x0 */
    public ArrayList<CTInboxMessage> f11309x0 = new ArrayList<>();

    /* JADX INFO: renamed from: D0 */
    public boolean f11303D0 = true;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2246a.this.f11311z0.m16316q0();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6539a(CTInboxMessage cTInboxMessage);

        /* JADX INFO: renamed from: r */
        void mo6540r(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap map, boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        ArrayList<C9473l> arrayList;
        super.mo467F(context);
        Bundle bundle = this.f6101g;
        if (bundle != null) {
            this.f11307v0 = (CleverTapInstanceConfig) bundle.getParcelable("config");
            this.f11302C0 = (CTInboxStyleConfig) bundle.getParcelable("styleConfig");
            this.f11305F0 = bundle.getInt("position", -1);
            Bundle bundle2 = this.f6101g;
            if (bundle2 != null) {
                String string = bundle2.getString("filter", null);
                CleverTapAPI cleverTapAPIM6423j = CleverTapAPI.m6423j(m3582e(), this.f11307v0, null);
                if (cleverTapAPIM6423j != null) {
                    C2181a.m6455h("CTInboxListViewFragment:onAttach() called with: tabPosition = [" + this.f11305F0 + "], filter = [" + string + "]");
                    C2181a.m6449a("CleverTapAPI:getAllInboxMessages: called");
                    ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
                    synchronized (cleverTapAPIM6423j.f10981b.f43475e.f43257b) {
                        try {
                            C9471j c9471j = cleverTapAPIM6423j.f10981b.f43477g.f43436e;
                            if (c9471j != null) {
                                synchronized (c9471j.f48554c) {
                                    c9471j.m17888d();
                                    arrayList = c9471j.f48553b;
                                }
                                for (C9473l c9473l : arrayList) {
                                    C2181a.m6455h("CTMessage Dao - " + c9473l.m17894d().toString());
                                    arrayList2.add(new CTInboxMessage(c9473l.m17894d()));
                                }
                            } else {
                                C2181a c2181aM6429f = cleverTapAPIM6423j.m6429f();
                                String strM6428e = cleverTapAPIM6423j.m6428e();
                                c2181aM6429f.getClass();
                                C2181a.m6452d(strM6428e, "Notification Inbox not initialized");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (string != null) {
                        ArrayList<CTInboxMessage> arrayList3 = new ArrayList<>();
                        for (CTInboxMessage cTInboxMessage : arrayList2) {
                            ArrayList arrayList4 = cTInboxMessage.f11272I;
                            if (arrayList4 != null && arrayList4.size() > 0) {
                                Iterator it = cTInboxMessage.f11272I.iterator();
                                while (true) {
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((String) it.next()).equalsIgnoreCase(string)) {
                                                arrayList3.add(cTInboxMessage);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList3;
                    }
                    this.f11309x0 = arrayList2;
                }
            }
            if (context instanceof CTInboxActivity) {
                this.f11304E0 = new WeakReference<>((b) m3582e());
            }
            if (context instanceof InterfaceC7953e0) {
                this.f11306G0 = (InterfaceC7953e0) context;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.inbox_list_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.list_view_linear_layout);
        this.f11310y0 = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.f11302C0.f10967c));
        TextView textView = (TextView) viewInflate.findViewById(R.id.list_view_no_message_view);
        if (this.f11309x0.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.f11302C0.f10971g);
            textView.setTextColor(Color.parseColor(this.f11302C0.f10972h));
            return viewInflate;
        }
        textView.setVisibility(8);
        m3582e();
        boolean z10 = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.f11301B0 = new C2247b(this.f11309x0, this);
        if (this.f11308w0) {
            C8192a c8192a = new C8192a(m3582e());
            this.f11311z0 = c8192a;
            c8192a.setVisibility(0);
            this.f11311z0.setLayoutManager(linearLayoutManager);
            this.f11311z0.m4199g(new C8193b());
            this.f11311z0.setItemAnimator(new C1152g());
            this.f11311z0.setAdapter(this.f11301B0);
            this.f11301B0.f7040a.m4259b();
            this.f11310y0.addView(this.f11311z0);
            if (this.f11303D0) {
                if (this.f11305F0 > 0) {
                    z10 = false;
                }
                if (z10) {
                    new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
                    this.f11303D0 = false;
                }
            }
            return viewInflate;
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list_view_recycler_view);
        this.f11300A0 = recyclerView;
        recyclerView.setVisibility(0);
        this.f11300A0.setLayoutManager(linearLayoutManager);
        this.f11300A0.m4199g(new C8193b());
        this.f11300A0.setItemAnimator(new C1152g());
        this.f11300A0.setAdapter(this.f11301B0);
        this.f11301B0.f7040a.m4259b();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        this.f6090a0 = true;
        C8192a c8192a = this.f11311z0;
        if (c8192a != null) {
            C2413j c2413j = c8192a.f44366e1;
            if (c2413j != null) {
                c2413j.stop();
                c8192a.f44366e1.release();
                c8192a.f44366e1 = null;
            }
            c8192a.f44368g1 = null;
            c8192a.f44369h1 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        C2413j c2413j;
        this.f6090a0 = true;
        C8192a c8192a = this.f11311z0;
        if (c8192a == null || (c2413j = c8192a.f44366e1) == null) {
            return;
        }
        c2413j.setPlayWhenReady(false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        C8192a c8192a = this.f11311z0;
        if (c8192a != null && c8192a.f44369h1 == null) {
            c8192a.m16315p0(c8192a.f44367f1);
            c8192a.m16316q0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        C8192a c8192a = this.f11311z0;
        if (c8192a != null && c8192a.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.f11311z0.getLayoutManager().mo4145j0());
        }
        RecyclerView recyclerView = this.f11300A0;
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            bundle.putParcelable("recyclerLayoutState", this.f11300A0.getLayoutManager().mo4145j0());
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: V */
    public final void mo3573V(Bundle bundle) {
        this.f6090a0 = true;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            C8192a c8192a = this.f11311z0;
            if (c8192a != null && c8192a.getLayoutManager() != null) {
                this.f11311z0.getLayoutManager().mo4142i0(parcelable);
            }
            RecyclerView recyclerView = this.f11300A0;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            this.f11300A0.getLayoutManager().mo4142i0(parcelable);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6554m0(Bundle bundle, int i10, HashMap<String, String> map, boolean z10) {
        b bVar;
        try {
            bVar = this.f11304E0.get();
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar == null) {
            C2181a.m6455h("InboxListener is null for messages");
        }
        if (bVar != null) {
            m3582e().getBaseContext();
            bVar.mo6540r(this.f11309x0.get(i10), bundle, map, z10);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6555n0(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.replace("\n", "").replace("\r", "")));
            if (m3582e() != null) {
                C7979r0.m15843j(m3582e(), intent);
            }
            m3595l0(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m6556o0(int i10, String str, JSONObject jSONObject, HashMap<String, String> map) {
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = jSONObject != null;
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject2 = this.f11309x0.get(i10).f11275L;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject2.keys();
            loop0: while (true) {
                while (true) {
                    if (!itKeys.hasNext()) {
                        break loop0;
                    }
                    String next = itKeys.next();
                    if (next.startsWith("wzrk_")) {
                        bundle.putString(next, jSONObject2.getString(next));
                    }
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString("wzrk_c2a", str);
            }
            m6554m0(bundle, i10, map, z12);
            if (map == null || map.isEmpty()) {
                z10 = false;
            }
            if (!z12) {
                String str2 = this.f11309x0.get(i10).f11285j.get(0).f11288a;
                if (str2 != null) {
                    m6555n0(str2);
                    return;
                }
                return;
            }
            this.f11309x0.get(i10).f11285j.get(0).getClass();
            if (CTInboxMessageContent.m6548e(jSONObject).contains("rfp") && this.f11306G0 != null) {
                this.f11309x0.get(i10).f11285j.get(0).getClass();
                if (jSONObject != null) {
                    try {
                        if (jSONObject.has("fbSettings")) {
                            z11 = jSONObject.getBoolean("fbSettings");
                        }
                    } catch (JSONException e10) {
                        C2181a.m6455h("Unable to get fallback settings key with JSON - " + e10.getLocalizedMessage());
                    }
                }
                this.f11306G0.mo6437F(z11);
                return;
            }
            if (z10) {
                return;
            }
            this.f11309x0.get(i10).f11285j.get(0).getClass();
            if (CTInboxMessageContent.m6548e(jSONObject).equalsIgnoreCase("copy")) {
                return;
            }
            this.f11309x0.get(i10).f11285j.get(0).getClass();
            String strM6547d = CTInboxMessageContent.m6547d(jSONObject);
            if (strM6547d != null) {
                m6555n0(strM6547d);
            }
        } catch (Throwable th2) {
            C2181a.m6449a("Error handling notification button click: " + th2.getCause());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m6557p0(int i10, int i11, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = this.f11309x0.get(i10).f11275L;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (true) {
                while (true) {
                    if (!itKeys.hasNext()) {
                        m6554m0(bundle, i10, null, z10);
                        m6555n0(this.f11309x0.get(i10).f11285j.get(i11).f11288a);
                        return;
                    } else {
                        String next = itKeys.next();
                        if (next.startsWith("wzrk_")) {
                            bundle.putString(next, jSONObject.getString(next));
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C2181a.m6449a("Error handling notification button click: " + th2.getCause());
        }
    }
}
