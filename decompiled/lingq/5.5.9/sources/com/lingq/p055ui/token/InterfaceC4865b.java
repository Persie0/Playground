package com.lingq.p055ui.token;

import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import kotlin.Pair;
import kotlinx.coroutines.flow.InterfaceC7137r;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.token.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4865b {

    /* JADX INFO: renamed from: com.lingq.ui.token.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m10388a(InterfaceC4865b interfaceC4865b, boolean z10, int i10) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            interfaceC4865b.mo10033Q1(z10, (i10 & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    void mo10025A1();

    /* JADX INFO: renamed from: D */
    InterfaceC7137r<TokenEditData> mo10026D();

    /* JADX INFO: renamed from: H0 */
    InterfaceC7137r<String> mo10027H0();

    /* JADX INFO: renamed from: I0 */
    void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12);

    /* JADX INFO: renamed from: L0 */
    InterfaceC7137r<String> mo10029L0();

    /* JADX INFO: renamed from: N0 */
    void mo10030N0(String str);

    /* JADX INFO: renamed from: N1 */
    InterfaceC7137r<TokenData> mo10031N1();

    /* JADX INFO: renamed from: P1 */
    void mo10032P1(int i10);

    /* JADX INFO: renamed from: Q1 */
    void mo10033Q1(boolean z10, boolean z11);

    /* JADX INFO: renamed from: S */
    InterfaceC7137r<Integer> mo10034S();

    /* JADX INFO: renamed from: U1 */
    InterfaceC7137r<TokenData> mo10035U1();

    /* JADX INFO: renamed from: V */
    InterfaceC7137r<TokenRelatedPhrase> mo10036V();

    /* JADX INFO: renamed from: V0 */
    void mo10037V0(TokenMeaning tokenMeaning);

    /* JADX INFO: renamed from: W1 */
    InterfaceC7137r<C9072e> mo10038W1();

    /* JADX INFO: renamed from: Y */
    InterfaceC7137r<TokenData> mo10039Y();

    /* JADX INFO: renamed from: b */
    void mo10041b();

    /* JADX INFO: renamed from: b2 */
    InterfaceC7137r<C9072e> mo10042b2();

    /* JADX INFO: renamed from: c1 */
    InterfaceC7137r<Boolean> mo10043c1();

    /* JADX INFO: renamed from: d2 */
    InterfaceC7137r<C9072e> mo10044d2();

    /* JADX INFO: renamed from: e0 */
    void mo10045e0();

    /* JADX INFO: renamed from: f2 */
    void mo10048f2(TokenData tokenData);

    /* JADX INFO: renamed from: g */
    void mo10049g();

    /* JADX INFO: renamed from: j */
    InterfaceC7137r<C9072e> mo10051j();

    /* JADX INFO: renamed from: l */
    InterfaceC7137r<C9072e> mo10053l();

    /* JADX INFO: renamed from: m */
    InterfaceC7137r<TokenMeaning> mo10054m();

    /* JADX INFO: renamed from: o0 */
    void mo10057o0(TokenMeaning tokenMeaning, String str);

    /* JADX INFO: renamed from: q1 */
    InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1();

    /* JADX INFO: renamed from: r */
    void mo10062r(String str);

    /* JADX INFO: renamed from: t0 */
    void mo10064t0(TokenData tokenData);

    /* JADX INFO: renamed from: z */
    void mo10065z();
}
