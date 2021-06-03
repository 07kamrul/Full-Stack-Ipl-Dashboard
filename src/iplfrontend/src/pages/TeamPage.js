import { React } from 'react';
import { MatchDetailCard } from '../components/MatchDetailCard';
import { MatchSmallCard } from '../components/MatchSmallCard';

export const TeamPage = () => {
    return (
      <div className="TeamPage">
        <h1>Rajasthan Royals</h1>
        <MatchDetailCard />
        <MatchSmallCard />
        <MatchSmallCard />
        <MatchSmallCard />
        <MatchSmallCard />

      </div>
    );
  }
  
  export default TeamPage;
  