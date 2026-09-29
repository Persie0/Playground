package com.lingq.p055ui.imports.userImport;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fj.AbstractC5544e;
import fj.C5546g;
import fj.C5557r;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p199jd.ViewOnClickListenerC6464i;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8294h2;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportTextFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportTextFragment extends AbstractC5544e {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f26757E0 = {C0204c.m857q(UserImportTextFragment.class, "getBinding()Lcom/lingq/databinding/FragmentUserImportTextBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f26758A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f26759B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f26760C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f26761D0;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportTextFragment$a */
    public /* synthetic */ class C4123a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26762a;

        static {
            int[] iArr = new int[UserImportDetailType.values().length];
            try {
                iArr[UserImportDetailType.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserImportDetailType.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26762a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportTextFragment$b */
    public static final class C4124b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8294h2 f26763a;

        public C4124b(C8294h2 c8294h2) {
            this.f26763a = c8294h2;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C8294h2 c8294h2 = this.f26763a;
            CharSequence error = c8294h2.f44850d.getError();
            if (error == null || C7661i.m15250P2(error)) {
                return;
            }
            c8294h2.f44850d.setError(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$1] */
    public UserImportTextFragment() {
        super(R.layout.fragment_user_import_text);
        this.f26758A0 = C4924a.m10477o0(this, UserImportTextFragment$binding$2.f26764j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f26759B0 = C8573r0.m16711Z(this, C5209i.m11118a(UserImportTextViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$delegateViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f26765b.m3579b0().m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f26760C0 = C8573r0.m16711Z(this, C5209i.m11118a(UserImportParentViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f26761D0 = new C1681f(C5209i.m11118a(C5557r.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.imports.userImport.UserImportTextFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C8294h2 c8294h2 = (C8294h2) this.f26758A0.m10489a(this, f26757E0[0]);
        c8294h2.f44847a.setOnClickListener(new ViewOnClickListenerC2238x(14, this));
        c8294h2.f44848b.setOnClickListener(new ViewOnClickListenerC6464i(this, 16, c8294h2));
        TextInputEditText textInputEditText = c8294h2.f44849c;
        C5207g.m11110e(textInputEditText, "etContent");
        textInputEditText.addTextChangedListener(new C4124b(c8294h2));
        C5546g value = ((UserImportParentViewModel) this.f26760C0.getValue()).mo10080T1().getValue();
        C1681f c1681f = this.f26761D0;
        c8294h2.f44850d.setHint(((C5557r) c1681f.getValue()).f34311a);
        int i10 = C4123a.f26762a[((C5557r) c1681f.getValue()).f34313c.ordinal()];
        if (i10 == 1) {
            textInputEditText.setText(value.f34281b);
        } else if (i10 != 2) {
            textInputEditText.setText(value.f34285f);
        } else {
            textInputEditText.setText(value.f34286g);
        }
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4125x4abf830(this, Lifecycle.State.STARTED, null, this), 3);
    }
}
